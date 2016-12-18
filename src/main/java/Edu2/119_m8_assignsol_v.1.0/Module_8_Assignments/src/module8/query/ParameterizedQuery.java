import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class ParameterizedQuery 
{
	private static final Logger logger = Logger.getLogger(ParameterizedQuery.class.getName());
	// properties file where database URL, user & password is stored.
	private static final String DB_CONN_FILE = "resources/dbcon.properties";
	
	public static void main(String[] args) 
	{
		Properties p = new Properties();		
		// Load the properties file
		try 
		{
			p.load(new FileInputStream(new File(DB_CONN_FILE)));
		} 
		catch (IOException e) 
		{
			logger.debug("Error reading " + DB_CONN_FILE);
			e.printStackTrace();
			System.exit(-1);
		}
		
		try(Connection conn = DriverManager.getConnection(p.getProperty("url"), p);)
		{
			String sqlStmt = "SELECT id, name FROM student WHERE name LIKE ?";
			try(PreparedStatement cmd = conn.prepareStatement(sqlStmt))
			{
				cmd.setString(1, "%g%");
				
				/**
				 * Dont use the PreparedStatement.executeQuery(String) for 
				 * parameterized queries. The '?' wont be substituted and 
				 * the query will be executed as it is and would result in an error.
				 */
				try (ResultSet set = cmd.executeQuery();)
				{
					int counter = 0;
					while (set.next())
					{
						counter++;
						System.out.println(set.getInt(1) + " " + set.getString(2));
					}
					
					logger.debug("Fetched " + counter + " rows.");
				}
			}
		}
		catch (SQLException e) 
		{
			logger.debug("Query failed.");
			e.printStackTrace();
		}
	}
}
