package Haustier;

public class Dackel extends Haustier
{
	public Dackel (String name, int alter)
	{
		super(name, alter);
	}
	
	public void geraeuschMachen()
	{
		System.out.println("\nWuff, wuff!");
	}
	
	public void zeigen()
	{
		System.out.printf("Ich bin ein %d Jahre alter Dackel und heiﬂe %s.", alter, name);
	}
}
