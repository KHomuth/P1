 import java.util.Scanner;
public class Aufgabe_6_4
{
	public static void main(String[] arg)
	{
		Reservierung flugzeugA = new Reservierung();
		Scanner scan = new Scanner(System.in);
		flugzeugA.initialisieren();
		int platz;
		String name;
		
		while (flugzeugA.getAnzahlFreieSitze() > 0)
		{
			System.out.print("\n\n\tWas wollen Sie tun? Platz abfragen [F], Reservieren [R], Druchen [D], Anuahl der Reservierungen[A]: ");
			char input = scan.next().charAt(0);
			switch (input)
			{
				case 'R':
				case 'r':
				System.out.print("\n\tWelcher Platz möchten Sie reservieren? : ");
				platz = scan.nextInt();
				System.out.print("\n\tWie ist Ihr Name? : ");
				name = scan.next();				
				if (flugzeugA.reservieren(platz, name) == true)
				{
					System.out.print("\n\t-->Reservierung erfolgreich!");
				}else{
					System.out.print("\n\t-->FEHLER: Reservierung abgebrochen. Bitte überprüfen Sie ob der Platz noch frei ist!");
				}
				break;
				
				case 'F':
				case 'f':
				System.out.print("\n\tWelcher Platz soll überprüft werden? : ");
				platz = scan.nextInt();
				if (flugzeugA.istFrei(platz) == true)
				{
					System.out.printf("\n\t-->Der Platz %d ist frei.",platz);
				}else{
					System.out.printf("\n\t-->Der Platz %d ist schon besetzt!",platz);
				}
					
				break;
				
				case 'D':
				case 'd':
				flugzeugA.drucken();
				break;
				
				case 'A':
				case 'a':
				System.out.print("\n\t-->Bisher sind/ist " + flugzeugA.getAnzahlReservierteSitze() + " von 10 Sitzen besetzt.");	
				break;
			}
		}
		
		if (flugzeugA.getAnzahlFreieSitze() == 0)
		{
			System.out.print("\n\n\t==>Das Flugzeug ist voll! Ab geht's in den Urlaub.");
		}else{
			System.out.print("\n\n\t==>FATAL ERR0R Passagierschwund!\n ");
		}
	}
}