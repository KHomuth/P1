import java.util.Scanner;


public class pi{
	public static void main(String[] args){

 System.out.print("Fuer wie viele Summanden wollen Sie pi berechnen? ");

 Scanner pi = new Scanner(System.in);
 long sumnum = pi.nextLong();

   double num = -4;  //Zähler
   double sum = 0;
   


 for (double denom = 1; denom <= 100000000; denom=denom+2){   //generiert den Nenner!
   num = num*(-1);
   sum = sum + (num/denom);
 }

System.out.println(sum);




	}
}
