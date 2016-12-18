package Edu2.Module_10_Assignments.src.module10.patterns.observer.randwatcher;

import java.util.Observable;

public class DummyGenerator extends Observable 
{
	public void generate(int N)
	{
		setChanged();
		notifyObservers();
	}
	
	public static void main(String[] args) 
	{
		DummyGenerator generator = new DummyGenerator();
		
		generator.addObserver(new RandListener());
		
		generator.generate(10);
		
		generator.deleteObservers();
	}
}
