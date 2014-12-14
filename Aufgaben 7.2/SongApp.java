 import java.util.Scanner;
public class SongApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Song liedA = new Song("Led Zepplin", "Stairway to Heaven", 300);
		System.out.println(liedA.getComposer());
		System.out.println(liedA.getTitle());
		System.out.println(liedA.getDuration());
		
		System.out.println(liedA);

	
		
	}
}