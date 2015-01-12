public class BonusKonto extends ServiceKonto
{
	private float bonus;
	
	public BonusKonto (String BesitzerName)
	{
		super(BesitzerName, true);
	}
	
	private void bonusBerechnen(float betrag)
	{
		int zufall = (int) (Math.random() * 7);
		if (zufall == 6)
		{
			bonus = betrag * 0.05f;
		}else{
			bonus = 0;
		}
	}
	
	protected float getBonus()
	{
		return bonus;
	}
	
	protected void einzahlen(float betrag)
	{
		bonusBerechnen(betrag);
		guthaben += betrag * (1 - gebuehr) + bonus;
	}
	
	public String toString()
	{
		return besitzer + " hat " + guthaben + " Euro auf seinem Konto. \nDie Gebühr auf das Bonuskonto beträgt " + gebuehr + "%.\nDer Bonus bei der letzten Tansakton hat " + getBonus() + " Euro Betragen.\n";
	}
}