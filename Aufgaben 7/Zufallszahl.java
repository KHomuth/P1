public class Zufallszahl
{
	private int zahl;
	private int counter;
	
	public void initialisieren()
	{
		zahl = (int)(Math.random()*10.999999f); 
	}
	
	public boolean ueberpruefen(int tipp)
	{
		counter += 1;
		
		if (tipp == zahl)
		{
			System.out.print("\n\t--> Treffer!");
			return true;
		}else if (tipp > zahl){
			System.out.printf("\n\t--> Ihre Zahl (%d) ist größer als die gesuchte Zahl!", tipp);
			return false;
		}else if (tipp < zahl){
			System.out.printf("\n\t--> Ihre Zahl (%d) ist kleiner als die gesuchte Zahl!", tipp);
			return false;
		}
		return false;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	
}