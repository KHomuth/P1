public class Rectangle extends Shape
{
	public double width;
	public double height;
	
	public Rectangle(int x, int y, double width, double height)
	{
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		double area = width * height;
		return area;
	}
	
	public String toString()
	{
		return "\tx,y: " + getX() + "," + getY() + "   bxh: " + width + "x" + height;
	}
}