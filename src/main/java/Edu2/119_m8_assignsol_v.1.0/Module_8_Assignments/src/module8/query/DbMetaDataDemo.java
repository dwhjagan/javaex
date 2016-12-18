import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class DbMetaDataDemo 
{
	private static final Logger logger = Logger.getLogger(DbMetaDataDemo.class.getName());
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
			DatabaseMetaData dbMetaData = conn.getMetaData();
			
			if (!dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
			{
				logger.debug("Database does not support ResultSet.TYPE_SCROLL_SENSITIVE & ResultSet.CONCUR_UPDATABLE");
				
				if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE))
					logger.debug("Database supports ResultSet.TYPE_SCROLL_INSENSITIVE");
			}
		}		
		catch (SQLException e) 
		{
			logger.debug("Read and update failed.");
			e.printStackTrace();
		}
	}
}
