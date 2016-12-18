import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class InParamDemo 
{
	private static final Logger logger = Logger.getLogger(InParamDemo.class.getName());
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
			try(CallableStatement proc = conn.prepareCall("CALL test.insert_student (?, ?)");)
			{
				proc.setInt(1, 4);
				proc.setString(2, "John Keynes");
				
				proc.execute();
				logger.debug("Success calling insert_student(...)");
			}
		}
		catch (SQLException e) 
		{
			logger.debug("Stored procedure call failed.");
			e.printStackTrace();
		}
	}
}
