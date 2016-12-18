import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class UpdateTableDemo 
{
	private static final Logger logger = Logger.getLogger(UpdateTableDemo.class.getName());
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
			String sqlStmt = "UPDATE test.student SET test.student.name = ? where test.student.ID = ?";
			
			try(PreparedStatement stmt = conn.prepareStatement(sqlStmt);)
			{
				stmt.setString(1, "John Forbes Nash"); // setting value for the first ?
				stmt.setInt(2, 1); // setting value for the second ?
				int r = stmt.executeUpdate();
				
				logger.debug("Updated " + r + " row(s).");
			}
		} 
		catch (SQLException e) 
		{
			logger.debug("Update failed.");
			e.printStackTrace();
		}
	}
}
