 import java.util.Scanner;
public class Ratespiel
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		Zufallszahl number = new Zufallszahl();
		number.initialisieren();
		boolean treffer = false;
		
		while (!treffer)
		{
			System.out.print("\n\n\tVersuchen Sie die Zahl zu erraten [0 bis 10]: ");
			int input = scan.nextInt();
			treffer = number.ueberpruefen(input);
		}
		
		int anzahlVersuche = number.getCounter();
		System.out.printf("\n\tSie haben %d Rateversuche gebraucht. \n", anzahlVersuche);
	}
}