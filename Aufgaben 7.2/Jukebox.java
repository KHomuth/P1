 import java.util.Scanner;
public class Jukebox
{
	private Song[] songList = new Song[20]; 
	private int anzahlSongs = 0;
	private int totalDuration;
	Scanner scan = new Scanner(System.in);
		
	public void addSong()
	{
		System.out.print("\n\n\tKomponist:");
		String composer = scan.next() + scan.nextLine();//so akteptiert der scanner auch komponisten/titel die leerzeichen enthalten.
		System.out.print("\n\tTitel: ");
		String title = scan.next() + scan.nextLine();
		System.out.print("\n\tLänge: ");
		int duration = scan.nextInt();
		
		Song song = new Song(composer, title, duration);
		songList[anzahlSongs] = song;
		
		anzahlSongs++;
	}
	
	public void playAll()
	{
		System.out.print("\n\t\t\t\t\tWiedergabe:");
		System.out.print("\n\t\t\t\t______________________________________");		
		for(int counter = 0; counter<anzahlSongs; counter++)
		{
			System.out.println("\n\t\t\t\t\t" + songList[counter]);
		}
		System.out.println("\t\t\t\t______________________________________");
		System.out.println("\t\t\t\t\tPlaylist zu ende.");
	}
	
	public int getTotalDuration()
	{
		totalDuration = 0;
		for(int counter = 0; counter < anzahlSongs; counter++)
		{
			totalDuration += songList[counter].getDuration();			
		}
		return totalDuration;
	}
	
	public int findSong(String title)
	{
		String search = title;
		for(int counter = 0; counter < anzahlSongs; counter++)
		{
			if( songList[counter].getTitle().equals(search) )
			{
				return counter;
			}
		}
		return -1;
	}
	
	public void shuffle()
	{
		Song temp;
		for(int counter = 0; counter < anzahlSongs; counter++)
		{
			int randomIndex = (int) (Math.random()*anzahlSongs);
			temp = songList[counter];
			songList[counter] = songList[randomIndex];
			songList[randomIndex] = temp;
		}
	}
	public void removeSong(String title)
	{
		int index;
		
		if (findSong(title) == -1)
		{
			System.out.println("\n\tSong nicht in der Playlist.");
		}else{
			index = findSong(title);
			songList[index] = null;
			int counter = index;
			while (counter<anzahlSongs-1)
			{
				songList[counter] = songList[counter+1];
				counter++;
			}
			
			songList[anzahlSongs] = null;
			anzahlSongs -= 1;
		}
	}
	
	public void run()
	{
		System.out.print("\n\t-------------------------------------------------------------------------------------");
		System.out.print("\n\tBitte eingeben: add (a), remove (r), shuffle (s); play (p), quit (q), Song finden (f)");
		System.out.println("\n\t-------------------------------------------------------------------------------------");
		System.out.print("\t");
		String input = scan.next();
		if(input.equalsIgnoreCase("a"))
		{
			addSong();
		}
		if(input.equalsIgnoreCase("r"))
		{
			System.out.print("\n\tWelchen Song wollen Sie aus der Playlist löschen? :");
			String lied = scan.next()+scan.nextLine();
			removeSong(lied);
		}
		if(input.equalsIgnoreCase("s"))
		{
			shuffle();
		}
		if(input.equalsIgnoreCase("p"))
		{
			playAll();
			System.out.println("\n\t\t\t\tGesamtdauer der Playlist: " + getTotalDuration() + " Sekunden.");
		}
		if(input.equalsIgnoreCase("q"))
		{
			JukeboxApp app = new JukeboxApp();
			app.end();
		}
		if(input.equalsIgnoreCase("f"))
		{
			System.out.print("\n\tWelchen Song suchen Sie? : ");
			String search = scan.next()+scan.nextLine();
			System.out.print("\n\tIhr Song ist an der  Wiedergabestelle " + findSong(search) + ".");
		}
	}
	
} 




































