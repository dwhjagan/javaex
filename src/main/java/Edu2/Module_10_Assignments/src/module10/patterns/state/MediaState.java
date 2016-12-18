package Edu2.Module_10_Assignments.src.module10.patterns.state;

/**
 * Internal media state not exposed to the client.
 * State = PLAY or STOP
 * @author pbose
 *
 */
interface MediaState 
{
	public void performAction(MediaPlayer context);
}
