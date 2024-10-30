import java.util.Scanner;

public class Ejercicio22 {
    public static void ejercicio(){
        int iNumeroIntroducido;
        int iContadorAux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido=sc.nextInt();
        sc.nextLine();

        iContadorAux=iNumeroIntroducido;

        for(int i=0; i<iNumeroIntroducido; i++){
            for (int j=0; j<iContadorAux; j++){
                System.out.print(" * ");
            }
            System.out.println("");
            iContadorAux--;
        }

        sc.close();
    }
}
