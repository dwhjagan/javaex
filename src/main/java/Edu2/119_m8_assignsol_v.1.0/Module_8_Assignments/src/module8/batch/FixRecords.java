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

public final class FixRecords 
{
	private static final Logger logger = Logger.getLogger(FixRecords.class.getName());
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
			Savepoint marker = null;
			conn.setAutoCommit(false);
			
			try(PreparedStatement cmd = conn.prepareStatement("INSERT INTO test.student VALUES (7, 'Radhanath Sikdar')");)
			{
				// start transaction
				marker = conn.setSavepoint("start_trans");
				
				cmd.addBatch();
				
				// second set of records to update
				String stmt1 = "UPDATE test.student SET test.student.name = 'Biswamoy Biswas' where test.student.ID = 4";
				cmd.addBatch(stmt1);
				
				logger.debug("Executing batch.");
				int [] count = cmd.executeBatch();
				logger.debug("Modified " + count.length + " record(s).");

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
