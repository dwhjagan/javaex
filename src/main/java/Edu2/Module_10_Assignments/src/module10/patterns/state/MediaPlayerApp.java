package Edu2.Module_10_Assignments.src.module10.patterns.state;

public final class MediaPlayerApp 
{
	public static void main(String[] args) 
	{
		MediaPlayer player = new MediaPlayer();
		
		player.play();
		player.stop();

	
		// calling play twice should print appropriate message
		player.play();
		player.play();
		// calling stop twice should print appropriate message
		player.stop();
		player.stop();
	}
}
