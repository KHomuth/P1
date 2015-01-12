public class Circle extends Shape
{
	public double radius;
	
	public Circle(int x, int y, float radius)
	{
		super(x,y);
		this.radius = radius;
	}
	
	public double getArea()
	{
		double area = Math.PI * Math.pow(radius , 2);
		return area;
	}
	
	public String toString()
	{
		return "\tx,y: " + getX() + "," + getY() + "   r: " + radius; 
	}
}