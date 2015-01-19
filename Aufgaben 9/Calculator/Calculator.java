package Calculator;
import java.util.Scanner;

public class Calculator 
{
	public Operator operatorList[] = new Operator[4];
	public int i = 4;
	
	public Calculator()
	{
		operatorList[0] = new Adder("+");
		operatorList[1] = new Subtractor("-");
		operatorList[2] = new Multipier("*");
		operatorList[3] = new Divider("/");
	}
	public void add(Operator operator)
	{
		operatorList[i] = operator;
		i++;
	}
	
	public Operator find(String name)
	{
		for (int counter = 0; counter < i; counter++) 
		{
			if (operatorList[counter].getName().equals(name)) 
			{
				return operatorList[counter];
			}
		}
		return null;
	}
	
	public void run()
	{
		boolean goOn = true;
		while (goOn)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Taschenrecchner: ");
			System.out.print("Zahl 1: ");
			double first = scan.nextDouble();
			System.out.print("Oprator [+ - * /]: ");
			String inputOperator = scan.next();
			System.out.print("Zahl 2: ");
			double second = scan.nextDouble();
			
			Operator oper = find(inputOperator);
			double result = oper.calculate(first, second);
			
			System.out.println(first + " " + inputOperator + " " + second + " = " + result);
			
			System.out.print("Weiter? [j/n]");
			String go = scan.next();
			if (go.equalsIgnoreCase("n")) goOn = false;
			
		}		
	}
}
