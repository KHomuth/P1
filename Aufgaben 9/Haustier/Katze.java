package Haustier;

public class Katze extends Haustier
{
	public Katze(String name, int alter) 
	{
		super(name, alter);
	}

	public void geraeuschMachen()
	{
		System.out.println("\nMiau, miau!");
	}
	
	public void zeigen()
	{
		System.out.printf("Ich bin eine %d Jahre alte Katze und heiße %s.", alter, name);
	}
}
