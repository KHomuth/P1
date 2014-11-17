public class Reservierung
{	
	String[] sitzPlan = new String[10];
	
	public void initialisieren()
	{
		for (int counter = 0; counter < sitzPlan.length; counter++)
		{
			sitzPlan[counter] = "frei";
		}
	}
	
	public boolean istFrei(int platzNummer)
	{
		if (sitzPlan[platzNummer].equals("frei")) 
		{
			return true;
		}
		return false;
	}
	
	public boolean reservieren(int platzNummer, String name)
	{
		if (sitzPlan[platzNummer].equals("frei"))
		{
			sitzPlan[platzNummer] = name;
			return true;
		}
		return false;
	}
	
	public void drucken()
	{
		for (int counter = 0; counter < sitzPlan.length; counter++)
		{
			String umbruch;
			if (counter % 2 == 0 || counter == 0)
			{
				umbruch = "\n\t";
			}else
			{
				umbruch = "";
			}
			System.out.print(umbruch + counter + ": " + sitzPlan[counter] + "             " );
		}
	}
	
	public int getAnzahlReservierteSitze()
	{
		int besetzt = 0;
		for (int counter = 0; counter < sitzPlan.length; counter ++)
		{
			if (! sitzPlan[counter].equals("frei"))
			{
				besetzt += 1;
			}
		}
		return besetzt;
	}

	public int getAnzahlFreieSitze()
	{
		int frei = 0;
		for (int counter = 0; counter < sitzPlan.length; counter ++)
		{
			if (sitzPlan[counter].equals("frei"))
			{
				frei += 1;
			}
		}
		return frei;
	}
}



































