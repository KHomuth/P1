package Calculator;
public class Subtractor extends Operator
{
	public Subtractor(String name)
	{
		super(name);
	}
	
	public double calculate(double first, double second)
	{
		return first - second;
	}
}
