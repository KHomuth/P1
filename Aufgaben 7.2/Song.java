public class Song
{
	private String composer;
	private String title;
	private int duration;    // in Sekunden
	
	public Song(String composer, String title, int duration)
	{
		this.composer =  composer;
		this.title = title;
		this.duration = duration;
	}
	
	public String getComposer()
	{
		return composer;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getDuration()
	{
		return duration;
	}
	
	public String toString()
	{
		return composer + ": " + title + ", " + duration + " Sekunden. ";
	}
}