package Edu2.module3.randevent;

import Edu.module3.randevent.*;

/**
 * The event consumer realising the {@link RandEventListener} interface
 * @author pbose
 *
 */
public final class RandEventConsumer implements RandEventListener
{
	@Override
	public void eventHandler(Edu.module3.randevent.RandEvent evObj)
	{
		System.out.println("Source: " + evObj.toString() + " "
				+ "Payload: " + evObj.getPayload());
	}
}
