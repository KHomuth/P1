 import java.util.Scanner;
public class MuenzautomatMain
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		Muenzautomat automat = new Muenzautomat();
		boolean goOn = true;
		
		System.out.print("\n\tWie heißt das Produkt? :");
		String name = scan.nextLine();
		System.out.print("\n\tWas ist der Einzelpreis von " + name +" [Cent] ? :" );
		int price = scan.nextInt();
		System.out.print("\n\tWie viele " + name + "s füllen Sie in den Automaten? :");
		int amount = scan.nextInt();
		
		automat.initalisieren(name, price, amount);
		
		while (goOn)
		{
			goOn = automat.run();
		}
		System.out.print("\n\t==> Der Automat ist leer bitte befüllen!");
	}
}