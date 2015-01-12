public class ServiceKonto extends Konto
{
	protected float gebuehr;
	
	public ServiceKonto(String BesitzerName)
	{
		super(BesitzerName);
		gebuehr = 0.02f;
	}
	
	public ServiceKonto(String BesitzerName, boolean BonusKonto)
	{
		super(BesitzerName);
		gebuehr = 0.03f;
	}
	
	protected void einzahlen(float betrag)
	{
		guthaben += betrag * (1 - gebuehr);
	}
	
	protected void abheben(float betrag)
	{
		guthaben -= betrag * (1 + gebuehr);
	}
	
	public String toString()
	{
		return besitzer + " hat " + guthaben + " Euro auf seinem Konto. \nDie Gebühr auf das Servicekonto beträgt " + gebuehr + "%.\n";
	}
}