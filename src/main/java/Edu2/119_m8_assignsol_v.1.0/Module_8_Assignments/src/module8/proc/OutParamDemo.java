import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class OutParamDemo 
{
	private static final Logger logger = Logger.getLogger(OutParamDemo.class.getName());
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
			try(CallableStatement proc = conn.prepareCall("CALL get_name (?, ?)");)
			{
				String name = null;
				proc.setInt(1, 6);
				proc.setString(2, name);
				proc.execute();
				name = proc.getString(2);
				if (name != null)
					System.out.println("Name: " + name);
				else
					System.out.println("ID does not exist");
				logger.debug("Success calling get_name(...)");
			}
		}
		catch (SQLException e) 
		{
			logger.debug("Stored procedure call failed.");
			e.printStackTrace();
		}
	}
}
