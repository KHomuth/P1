import java.util.Scanner;

public abstract class AbstractApp 
{
	protected Scanner scanner = new Scanner(System.in);
	
	protected abstract void repeat();
	public abstract void prepare();	
	public abstract void finish();
	
	public void run()
	{
		prepare();
		boolean finished = false;
		while(!finished)
		{
			repeat();
			System.out.print("Abschliessen? [y/n] ");
			String eingabe = scanner.next();
			if (eingabe.equalsIgnoreCase("y"))
			{
				finished = true;
			}
		}
		finish();
	}
}
