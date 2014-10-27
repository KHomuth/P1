public class pi{
	public static void main(String[] args){


   double num = -4;  //Zähler
    double sum = 0;
   


 for (double denom = 1; denom <= 20; denom=denom+2){   //generiert den Nenner!
   num = num*(-1);
   sum = sum + (num/denom);
 }

System.out.println(sum);




	}
}
