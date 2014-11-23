 import java.util.Scanner;
public class Taschenrechner
{
	public static void main(String[] arg)
	{
		MathematischeOperationen calculate = new MathematischeOperationen();
		Scanner scan = new Scanner(System.in);
		boolean tempOn = false;
		float number1 = 0;
		float number2;
		float result = 0;
		
		while (true)	
		{
			if (!tempOn)
			{
				System.out.print("\n\tGeben Sie die erste Zahl ein: ");
				number1 =  scan.nextFloat();
			}else{
				number1 = calculate.temp;
			}
			System.out.print("\n\tWelche Operation wollen Sie durchführen? [+ - * /]: ");
			char operation = scan.next().charAt(0);
			System.out.print("\n\tGeben Sie die zweite Zahl ein: ");
			number2 =  scan.nextFloat();
		
			switch (operation)
			{
				case '+':
					result = calculate.add(number1, number2);
				break;
				case '-':
					result = calculate.sub(number1, number2);
				break;
				case '*':
					result = calculate.mul(number1, number2);
				break;
				case '/':
					result = calculate.div(number1, number2);
				break;
			}
			System.out.print("\n\t--> " + number1 + " " + operation + " " + number2 + " = " + result);
			
			System.out.print("\n\n\tWollen Sie das Ergebnis zwischenspeichern [z], Wurzel aus Ergebnis ziehen [w],\n\tvon vorne beginnen [n] oder beenden [b]? ");
			char temp = scan.next().charAt(0);
			if (temp == 'z' || temp == 'z')
			{
				calculate.tempOn = true;
				tempOn = true;
			}else if(temp == 'w' || temp == 'W'){
				System.out.println("\n\t--> Wurzel(" + calculate.temp + ") = " + Math.sqrt(calculate.temp));
			}else if(temp == 'b' || temp == 'B'){
				break;
			}else{
				calculate.tempOn = false;
				tempOn = false;
			}
		}
	}
}