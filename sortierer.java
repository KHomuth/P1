import java.util.Scanner;
import java.util.Arrays;

//test
   public class sortierer{
	  public static void main(String[] args){


          System.out.print("Wie lang soll das Array sein? ");
          Scanner a = new Scanner(System.in);
          int N = a.nextInt();
 
          int[] array = new int[N];                 //Der Benutzer kann selber bestimmen wie lang das Array sein soll!

       

          
          System.out.println("Gib nun beliebige Zahlen ein!"); 
         for(int x=0;x<array.length;x++){
          int M = a.nextInt();
          array[x] = M;                                                    //Hier kann der Benutzer dem Array Werte in die Indizes eintragen!
          }
         for(int y=0;y<array.length;y++){                             //die schleife geht die inzizes von 0 bis N durch und gibt diese aus
         	System.out.print(array[y] + " ");
         if(y==array.length-1){ 
         	System.out.print(" lautet die Originalreihenfolge!");
         }
         }
         System.out.print("\n");  
         for(int z=N-1;z>=0;z--){                        //eine forschleife, die umgekehrt die Indizes des Arrays ausgibt!
         	System.out.print(array[z] + " ");
         if(z==0){
         	System.out.print(" lautet die umgekehrte Reihenfolge!");
         }
         }





          Arrays.sort(array);            ///Hier wird das Array sortiert!
          System.out.println("\nDie sortierte Reihenfolge lautet : " + Arrays.toString(array));    //Das array wird in einen String umgewandelt!
          





	}
} 
