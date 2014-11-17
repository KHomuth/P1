public class Cash
{
	private float sum = 0;
	
	public void add(float price)
	{
		sum += price;
	}
	public float getSum()
	{
		return sum;
	}
	public void reset()
	{
		sum = 0;
	}
}
