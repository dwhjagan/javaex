package Edu2.Module_10_Assignments.src.module10.patterns.observer.randwatcher;

import java.util.Observable;
import java.util.Observer;

public class RandListener implements Observer 
{
	RandGenerator subject = null;
	
	@Override
	public void update(Observable arg0, Object arg1) 
	{
		// only interested in subject = RandGenerator
		if (arg0 instanceof RandGenerator)
		{
			System.out.println("Got an odd random number -> " + arg1.toString());
		}
		else
			System.out.println("Got a dummy notification.");
	}
}
