import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Properties;

import org.apache.log4j.Logger;

public final class BatchProcessDemo 
{
	private static final Logger logger = Logger.getLogger(BatchProcessDemo.class.getName());
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
			Savepoint marker = null;
			conn.setAutoCommit(false);
			
			String stmt = "INSERT INTO student VALUES (?, ?)";
			
			try(PreparedStatement cmd = conn.prepareStatement(stmt);)
			{
				// start transaction
				marker = conn.setSavepoint("start_trans");
				
				// first set of records
				cmd.setInt(1, 5);
				cmd.setString(2, "David Attenborough");
				cmd.addBatch();
				
				// second set of records
				cmd.setInt(1, 6);
				cmd.setString(2, "Karl Sagan");
				cmd.addBatch();
				
				logger.debug("Executing batch.");
				int [] count = cmd.executeBatch();
				logger.debug("Inserted " + count.length + " record(s).");

				conn.commit();
				logger.debug("Committed transaction.");
				// ending transaction
				conn.releaseSavepoint(marker);
				conn.setAutoCommit(true);
			}
			catch (SQLException e) 
			{
				logger.debug("Batch processing failed.");
				e.printStackTrace();
				
				if (marker != null)
					conn.rollback(marker);
				
				logger.debug("Rolled back transaction.");
				conn.setAutoCommit(true);
			}
			
		}
		catch (SQLException e) 
		{
			logger.debug("Connection to database failed.");
			e.printStackTrace();
		}
	}
}
