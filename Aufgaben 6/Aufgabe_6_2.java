import java.util.Scanner;

public class Aufgabe_6_2
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		Cash customer = new Cash();
		while (true)	
		{	
			System.out.print("\n\n\tPreis oder neuer Kunde [0] oder fertig [-1] : ");
			float input = scan.nextFloat();
			if (input > 0)
			{
				customer.add(input);
				
			}
			else if (input == 0)
			{
				customer.reset();
			}
			else if (input == -1)
			{
				System.out.print("\n\t-->Der endpreis ist: " + customer.getSum());
				break;
			}
			System.out.print("\n\tZwischensumme: " + customer.getSum());
		}
	}
}