import java.util.Scanner;

public class Ejercicio13 {
    public static void ejercicio(){
        int iNumeroIntroducido=1;
        boolean bEsPrimo = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        for(int i=2; i<iNumeroIntroducido; i++){
            if(iNumeroIntroducido%i==0){
                bEsPrimo=false;
            }
        }

        if(bEsPrimo==true){
            System.out.println("El número "+iNumeroIntroducido+" es primo.");
        }
        else{
            System.out.println("El número "+iNumeroIntroducido+" NO es primo.");
        }

        sc.close();
    }
}
