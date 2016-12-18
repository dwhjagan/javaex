package Edu2.Module_10_Assignments.src.module10.patterns.state;

public class MediaPlayer 
{
	protected MediaState state = new StopState();
	
	public void play()
	{
		// do nothing if already playing
		if (state instanceof PlayState)
		{
			System.out.println("Already playing...");
			return;
		}
		
		// change state to play
		state = new PlayState();
		state.performAction(this);
	}

	public void stop()
	{
		if (state instanceof StopState)
		{
			System.out.println("Already stopped.");
			return;
		}
		
		// change state to stop
		state = new StopState();		
		state.performAction(this);
	}
}
