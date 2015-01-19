package Haustier;

 import java.util.Scanner;
public class HaustierSimulation 
{
	public Haustier[] haustierListe = new Haustier[2];
	public int i = 0;
	
	public void hinzufuegen(Haustier haustier)
	{
		haustierListe[i] = haustier;
		i++;
	}
	
	public Haustier finden(String name)
	{
		for (int counter = 0; counter < i; counter++)
		{
			if (haustierListe[counter].getName().equals(name))
			{
				return haustierListe[counter];
			}
		}
		return null; //Der Compiler akteptiert die Methode nur wenn es in jedem Fall eine rückgabe gibt.
	}
	public void einTierZeigen(String name)
	{
		for (int counter = 0; counter < i; counter++)
		{
			if(haustierListe[counter].getName().equals(name))
			{
				haustierListe[counter].zeigen();
			}
		}
	}
	
	public void alleTiereZeigen()
	{
		for (int counter = 0; counter < i; counter++)
		{
			System.out.println( "\t" + (counter+1) + ": " + haustierListe[counter].getName() ); 
		}
	}
	
	public void los()
	{
		boolean goOn = true;
		while(goOn)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Welches Tier wollen Sie sehen? wir haben folgende Tiere: ");
			alleTiereZeigen();
			System.out.print("Geben Sie bitte den Namen ein: ");
			String input = scan.next();
			
			einTierZeigen(input);
			Haustier tier = finden(input);
			tier.geraeuschMachen();
			
			System.out.print("Nochmal? [j/n] ");
			input = scan.next();
			if (input.equalsIgnoreCase("n"))
			{
				goOn = false;
			}
		}		
	}
}

















