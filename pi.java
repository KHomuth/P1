public class pi{
	public static void main(String[] args){


   int num = -4;  //Zähler
    double sum = 0;
   


 for (int denom = 1; denom <= 20; denom=denom+2){   //generiert den Nenner!
   num = num*(-1);
   sum = sum + (num/denom);
 }

System.out.println(sum);




	}
}
