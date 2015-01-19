package Calculator;
public class Divider extends Operator
{
	public Divider(String name)
	{
		super(name);
	}
	
	public double calculate(double first, double second)
	{
		return first / second;
	}
}
