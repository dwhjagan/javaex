package Edu2.Module_10_Assignments.src.module10.patterns.state;

class StopState implements MediaState 
{
	@Override
	public void performAction(MediaPlayer context) 
	{
		System.out.println("Stopped.");
	}
}
