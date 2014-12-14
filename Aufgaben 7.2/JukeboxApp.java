public class JukeboxApp
{
	private static boolean goOn = true;
	public void end()
	{
		goOn=false;
	}
	
	public static void main(String[] args)
	{
		Jukebox jukebox = new Jukebox();
		while (goOn)
		{
			jukebox.run();
		}
		System.out.print("\n\n\t" + (char) 14 + " Bye " + (char) 14);
	}
}