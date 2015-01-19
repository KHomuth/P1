package Calculator;
public class Adder extends Operator 
{
	public Adder(String name)
	{
		super(name);
	}
	public double calculate(double first, double second)
	{
		return first + second;
	}
}
