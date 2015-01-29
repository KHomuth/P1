import java.util.Scanner;

public class AdditionsMaschine extends AbstractApp
{
	public float sum;
	public Scanner scan = new Scanner(System.in);
	public void prepare()
	{
		sum = 0;
	}
	
	public void repeat()
	{
		System.out.print("Geben Sie eine Zahl ein die addiert werden soll: ");
		float eingabe = scan.nextFloat();
		sum += eingabe;
	}
	
	public void finish()
	{
		System.out.printf("Alles zsammen ergibt: %f", sum);
	}
}
