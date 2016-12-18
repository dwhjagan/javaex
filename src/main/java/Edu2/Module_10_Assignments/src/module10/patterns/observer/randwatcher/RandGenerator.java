package Edu2.Module_10_Assignments.src.module10.patterns.observer.randwatcher;

import java.util.Observable;

public class RandGenerator extends Observable 
{
	public void generate(int N)
	{
		float success = 0;
		for (int i = 0; i < N; i++)
		{
			int arg = (int)(Math.random()*1000);
			if (arg%2 != 0)
			{
				setChanged();
				notifyObservers(arg);
				success++;
			}
		}
		
		System.out.printf("Success rate: %.0f%%", 100*success/N);
	}
	
	public static void main(String [] args)
	{
		RandGenerator generator = new RandGenerator();
		
		generator.addObserver(new RandListener());
		
		generator.generate(10);
		
		generator.deleteObservers();
	}
}
