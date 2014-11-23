public class MathematischeOperationen
{
	private float a;
	private float b;
	public float temp;
	public boolean tempOn = false;
	public float add(float a, float b)
	{
		if (tempOn) 
		{
			a = temp;
		}
		temp = a + b;
		return a + b;
	}
	
	public float sub(float a, float b)
	{
		if (tempOn) 
		{
			a = temp;
		}
		temp = a - b;
		return a - b;
	}
	
	public float mul(float a, float b)
	{
		if (tempOn) 
		{
			a = temp;
		}
		temp = a * b;
		return a * b;
	}
	
	public float div(float a, float b)
	{
		if (tempOn) 
		{
			a = temp;
		}
		temp = a / b;
		return a / b;
	}
}