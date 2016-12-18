package Edu2.Module_4_Assignments.src.module4;

import org.apache.log4j.Logger;

/**
 * Class demonstrating the Log4j framework.
 * @author pbose
 *
 */
public final class Log4jDemo 
{
	/**
	 * Loading the Log4j framework and initialising the framework with the 
	 * values from log4j.properties file.
	 */
	private static final Logger logger = 
			Logger.getLogger(Log4jDemo.class.getName());
	
	/**
	 * A static utility method to find the sum of N integers.
	 * @param list
	 * @return
	 */
	private static int sum(int [] list)
	{
		logger.trace("Entering sum(...)");
		int val = 0;
		for (int i = 0; i < list.length; i++)
		{
			val += list[i];
			logger.debug("val = " + val);
		}
		
		logger.trace("Returning from sum(...)");
		return val;
	}
	public static void main(String[] args) 
	{
		logger.info("Entering main(...)");
		int sum = Log4jDemo.sum(new int [] {1,2,3,4,5,6,7});
		logger.debug("Final sum = " + sum);
		logger.info("Exiting main(...)");

	}
}
