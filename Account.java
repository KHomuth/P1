public class Account
{
	private float balance;
	private String owner;
	public Account(String name, float startBalance)
	{
		balance = startBalance;
		owner = name;
	}
	public void deposit(float amount)
	{
		balance += amount;
	}
	public boolean drawOut(float amount)
	{
		if ((balance - amount) > 0)
		{
			balance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public float getBalance()
	{
		return balance;
	}
	//keine ahnunge wie das gehen soll
	/*String print()
	{
		return "\n\tKontostand(" + owner + "): " + balance + "Euro";
	}*/
}














