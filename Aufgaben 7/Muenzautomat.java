 import java.util.Scanner;
public class Muenzautomat
{
	Scanner scan = new Scanner(System.in);
	private String productName;
	private int price;
	private int inventory;
	private int inputMoney;	
	
	public void initalisieren(String name, int price, int inventory)
	{
		productName = name;
		this.price = price;
		this.inventory = inventory+1;
	}
	
	public boolean run()
	{
		inventory -= 1;
		if (inventory == 0)
		{
			return false;
		}
		produktZeigen();
		return true;
	}
	
	private void produktZeigen()
	{
		System.out.print("\n\t" + productName + " für " + price + " Cent");
		geldEingeben();
	}
	
	private void geldEingeben()
	{
		while (inputMoney < price)
		{
			int differenz = price - inputMoney;
			System.out.print("\n\tZu zahlen: " + differenz + " Cent. Wie viel Geld werfen Sie ein? : ");
			int einwurf = scan.nextInt();
			inputMoney += einwurf; 
		}
		geldWechseln();
	}
	
	private void geldWechseln()
	{
		int rückgeld = inputMoney - price;
		System.out.printf("\n\tSie bekommen %d Cent zurück, ",rückgeld);
		inputMoney = 0;
		produktAusgeben();
	}
	
	private void produktAusgeben()
	{
		System.out.print("und Sie erhalten ein \n\t*********************\n\t     " + productName + "\n\t*********************\n");
	}
}