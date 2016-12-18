import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * Demonstrates how to connect to a database.
 * @author pbose
 *
 */

public final class TestConnectionMySQL 
{
	private static final Logger logger = Logger.getLogger(TestConnectionMySQL.class.getName());
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

		logger.debug("Connecting to database.");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		try(Connection conn = DriverManager.getConnection(p.getProperty("url"), p);)
		{
			logger.debug("Connection succeeded.");
		} 
		catch (SQLException e) 
		{
			logger.debug("Connection failed.");
			e.printStackTrace();
		}
		finally
		{ logger.debug("Connection closed."); }
	}
}
