/*
Belegaufgabe 2013/14, Einfuehrung in die Informatik
14. Februar 2013
*/

public class Beleg {
    static final int N=12345;

    // wichtig, sogar sehr wichtig
    static byte f[] = new byte[(N+1)/2];

    /*
        obige line darf nicht veraendert werden!!!

        Das Feld f enthaelt die Informationen aus dem Sieb des Eratosthenes,
        fuer die geraden Zahlen ist hier kein Platz vorgesehen,
        sie sind keine Primzahlkandidaten.
        Benutzen Sie in allen Methoden dieses Feld mit geeigneten Umrechungen.
    */

    public static void main(String[] args) {
        byte zahlPrim[] = primz(sieb());
        int eingabe[][] = analprimz(zahlPrim, args);
        int line = 0;

        System.out.println("================================================================================\n");
        System.out.println("Dieser Beleg wurde von Kevin Homuth (*01.02.1994; Matrikelnr.: 113092) erstellt.");
        System.out.println("\n================================================================================\n");
        System.out.println("Zur Zeit sind nur die Zahlen ab 3 bis "+N+" im Speicher verfuegbar.\n");
        System.out.println("Primzahlen bis "+N+":\t\t\t"+primanz(zahlPrim));
        System.out.println("Primzahlzwillinge bis "+N+":\t\t"+primzwanz(zahlPrim));
        System.out.println("Letzter Primzahlzwilling ist:\t\t("+(vorPrzz(zahlPrim, zahlPrim.length-1)-2)+" "+vorPrzz(zahlPrim, zahlPrim.length-1)+")");
        System.out.println("Der groeszter Abstand zwischen zwei PZ ist:\t"+primabst(sieb()));
        System.out.println("\n================================================================================\n");
    
        if (args.length != 0) {
            for (int i = 0; i < eingabe.length; i++) {
                switch (eingabe[i][0]) {
                    case 0:
                        System.out.println(
                            "("+args[i]+") ist keine Primzahl.\n("+
                            eingabe[i][1]+
                            ") ist die Primzahl davor.\n("+
                            (eingabe[i][2]-2)+" "+eingabe[i][2]+
                            ") ist der Primzahl-Zwilling davor.\n "
                            );
                        break;
                    case 1:
                        System.out.println("("+args[i]+") ist eine Primzahl.\n");
                        break;
                    case 2:
                        System.out.println("("+args[i]+") ist ein Primzahlzwilling.\n");
                        break;
                    case 3:
                        System.out.println(
                            "("+args[i]+") Sie Schelm, eine gerade Zahl kann keine PZ sein!");
                        break;
                    case 4:
                        System.out.println("("+args[i]+") liegt auszerhalb des Bereichs.\n");
                        break;
                }
            }
        }
        else {
            for (int i = 0; i < zahlPrim.length; i++) {
                if (zahlPrim[i] != 0) {
                    int primeNum = i*2+1; 
                    if (zahlPrim[i] == 2) {
                        System.out.print(primeNum+"*  ");
                    }
                    else
                        System.out.print(primeNum+"   ");

                    line++;
                    if (line % 10 == 0)
                        System.out.print("\n");
                }
            }
        }

        System.out.println("\n");
        }

     private static byte[] sieb() {
        int n = N;
        byte prim[] = new byte[n];

        for (int i = 0; i < n; i++)
            prim[i] = 1; 
            //Annahme, alle Zahlen prim

        for (int i = 2; i < n; i++) {
            if ( i % 2 == 0 ){
                prim[i] = 0; 
                //nicht Prim,da gerade

                for (int v = 2; (i+1)*v < n; v++) {
                    int vielf = (i+1)*v; 
                    prim[vielf] = 0; 
                    //Vielfache einer Primzahl -> nicht prim
                }
            }
        }
        return prim;
    }

    private static byte[] primz(byte[] prim) {
        //erzeugt Array
        for (int i = 2; i < N-2; i++) {
            if (prim[i] == 1) {
                f[(i-1)/2] = 1; 
                    //prim[i] = 1 -> Primzahl
                if (prim[i+2] == 1)
                    f[(i-1)/2] = 2; 
                    //uebernaechste Zahl auch Prim -> Primzahlzwilling
                if (prim[i-2] == 1)
                    f[(i-1)/2] = 2; 
                    //vorletzte Zahl auch Prim -> Primzahlzwilling
            }
        }
        return f;
    }

    private static int primanz(byte[] primz) {
        int count = 0;
        for (int i = 0; i < primz.length; i++)
            if (primz[i] == 1 || primz[i] == 2) count++;
        return count;
        //Anzahl Primzahlen
    }

    private static int primzwanz(byte[] primz) {
        int count = 0;
        for (int i = 0; i < primz.length; i++)
            if (primz[i] == 2) count++;
        return count;
        //Anzahl Primzahlzwillinge
    }

    private static int primabst(byte[] notprim) {
        int count = 0, abs = 0;
        for (int i = 0; i < notprim.length; i++) {
            if (notprim[i] == 0)
                count++;
            else {
                if (count > abs) abs = count;
                count = 0;
            }
        }
        return abs;
        //Groeszter Abstand zw. Primzahlen
    }

    private static int[][] analprimz(byte[] primz, String[] args) {
        
        int anal[][] = new int[args.length][3]; 

        for (int i = 0; i < args.length; i++) { 
            int param = Integer.parseInt(args[i]);

            if (param < 3 || param > N) {anal[i][0] = 4; continue;}

            for (int j = 0; j < primz.length; j++) { 

                if (param < j*2+1 && param % 2 == 0) {
                    anal[i][0] = 3;
                    anal[i][1] = vorPr(primz, j-1);
                    anal[i][2] = vorPrzz(primz, j-1);
                    break;
                }

                else if (param == j*2+1 && primz[j] == 0) {
                    anal[i][0] = 0;
                    anal[i][1] = vorPr(primz, j);
                    anal[i][2] = vorPrzz(primz, j);
                    break;
                }

                else if (param == j*2+1 && primz[j] != 0) {
                    anal[i][0] = primz[j];
                    break;
                }
            }
        }
        return anal;
        //Analysiert Eingabedaten
    }

    private static int vorPr (byte[] primz, int n) {
        if (primz[n] != 0)
            return n*2+1;
        else
            return vorPr(primz, n-1);
        //errechnet vorherige Primzahl
    }

    private static int vorPrzz (byte[] primz, int n) {
        if (primz[n] == 2)
            return n*2+1;
        else
            return vorPrzz(primz, n-1);
        //errechnet vorherigen Primzahlzwilling
    }

}
