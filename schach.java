import java.util.*;

public class schach{
	public static void main(String[] args){

		System.out.println("Wie breit soll das Muster sein?");

		Scanner a = new Scanner(System.in);
		int br = a.nextInt();

		System.out.println("Wie hoch soll das Muster sein?");

		Scanner b = new Scanner(System.in);
		int h = b.nextInt();

		for(int i=0; i<h; i++){
			for (int j=0; j<br; j++){
				if((i+j)%2==0)
					System.out.print("#");
				else 
					System.out.print(" "); 
			}
		System.out.print("\n");
		}

	}
}
