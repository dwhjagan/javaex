import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class InsertTableDemo 
{
	private static final Logger logger = Logger.getLogger(InsertTableDemo.class.getName());
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
			String sqlStmt = "INSERT INTO test.student VALUES(?, ?)";
			
			try(PreparedStatement stmt = conn.prepareStatement(sqlStmt);)
			{
				stmt.setInt(1, 3); // setting value for the first ?
				stmt.setString(2, "Karl Pearson"); // setting value for the second ?
				int r = stmt.executeUpdate();
				
				logger.debug("Inserted " + r + " row(s).");
			}
		} 
		catch (SQLException e) 
		{
			logger.debug("Insert failed.");
			e.printStackTrace();
		}
}
}
