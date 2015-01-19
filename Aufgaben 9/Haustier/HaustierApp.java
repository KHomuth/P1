package Haustier;

public class HaustierApp 
{
	public static void main(String[] args)
	{
		HaustierSimulation haustierSimulation = new HaustierSimulation();
		haustierSimulation.hinzufuegen(new Dackel("Waldi", 3));
		haustierSimulation.hinzufuegen(new Katze("Mausi", 4));
		haustierSimulation.los();
		System.out.print("Bye, Bye!");
	}
}
