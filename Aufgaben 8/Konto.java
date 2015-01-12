public class Konto
{
	protected String besitzer;
	protected float guthaben = 0;
	
	public Konto(String BesitzerName)
	{
		besitzer = BesitzerName;
	}
	
	protected float getGuthaben()
	{
		return guthaben;
	}
	
	protected void einzahlen(float betrag)
	{
		guthaben += betrag;
	}
	
	protected void abheben(float betrag)
	{
		guthaben -= betrag;
	}
	
	public String toString()
	{
		return besitzer + " hat " + guthaben + " Euro auf seinem Konto.\n";
	}
}