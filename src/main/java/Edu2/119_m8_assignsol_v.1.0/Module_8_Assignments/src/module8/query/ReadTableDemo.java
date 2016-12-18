import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class ReadTableDemo 
{
	private static final Logger logger = Logger.getLogger(ReadTableDemo.class.getName());
	// properties file where database URL, user & password is stored.
	private static final String DB_CONN_FILE = "resources/dbcon.properties";
	
	public static void main(String[] args) throws Exception
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
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		try(Connection conn = DriverManager.getConnection(p.getProperty("url"), p);)
		{
			String sqlStmt = "SELECT world.country.name, world.country.continent FROM world.country WHERE world.country.name LIKE 'A%'";
			Statement stmt = conn.createStatement();
			
			try (ResultSet set = stmt.executeQuery(sqlStmt);)
			{
				int counter = 0;
				while (set.next())
				{
					counter++;
					System.out.println(set.getString(1) + " " + set.getString(2));
				}
				
				logger.debug("Fetched " + counter + " rows.");
			}
		} 
		catch (SQLException e) 
		{
			logger.debug("Query failed.");
			e.printStackTrace();
		}
	}
}
