public class Aufgabe_6_3
{	
	public static void main(String[] arg)
	{
		//initalisierung
		Account customer;
		customer = new Account("Jan", 500.0f);
		//kontostand
		System.out.println("\n\tKontostand: " + customer.getBalance() + " Euro");
		
		//guthaben gutschrift
		customer.deposit(100.00f);
		System.out.println("\n\tKontostand: " + customer.getBalance() + " Euro");
	
		//50 euro abheben
		if (customer.drawOut(50) == true)
		{
			System.out.println("\n\tKontostand: " + customer.getBalance() + " Euro");
		}
		else
		{
			System.out.println("\n\tFehler Konto überzogen!");
		}
		
		System.out.print(customer.print());
	}
}