public class ShapesApp
{
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(10 , 10, 100 , 200);
		System.out. println( rectangle );
		System.out.println("\tFlaeche: " + rectangle . getArea ());
		Circle circle = new Circle(100 , 100 , 10);
		System.out.println( circle );
		System.out.println("\tFlaeche: " + circle . getArea ());
	}
}