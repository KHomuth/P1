package Calculator;
public class Multipier extends Operator
{
	public Multipier(String name)
	{
		super(name);
	}
	
	public double calculate(double first, double second)
	{
		return first * second;
	}
}
