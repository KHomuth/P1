import java.util.*;

public class prim{
	
	public static void main(String[] args){

	System.out.println("Geben Sie eine Zahl ein!");

		Scanner a = new Scanner(System.in);
		long x = a.nextLong();


	long startMilliSeconds = System.currentTimeMillis();

	if(x<2)
		System.out.println("Die Zahl ist nicht prim.");

	if(x==2)
		System.out.println("Die Zahl ist prim.");

	for (long y=2; y<=x-1; y++){
		if(x%y==0)
			System.out.println("Die Zahl ist nicht prim.");
		else
			System.out.println("Die Zahl ist prim.");
	}
	

	long endMilliSeconds = System.currentTimeMillis();
	long duration = endMilliSeconds - startMilliSeconds;

	System.out.println("Das Programm hat "+duration+" Milisekunden benoetigt.");
	}
}
