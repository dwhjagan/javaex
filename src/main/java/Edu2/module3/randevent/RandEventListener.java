package Edu2.module3.randevent;

import Edu.module3.randevent.*;

/**
 * 
 * @author pbose
 * Interface that the event consumers should implement
 */
public interface RandEventListener
{
	/**
	 * This method is called by event source notifier.
	 * @param evObj
	 */
	public void eventHandler(Edu.module3.randevent.RandEvent evObj);
}
