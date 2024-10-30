import java.util.Scanner;

public class Ejercicio23 {
    public static void ejercicio(){
        int iNumeroIntroducido;
        int iContadorPrimos=0;
        boolean bEsPrimo=true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido=sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=iNumeroIntroducido; i++){
            bEsPrimo=true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    bEsPrimo=false;
                }
            }
            if(bEsPrimo==true){
                System.out.println("El número "+i+" es primo.");
                iContadorPrimos++;
            }

        }
        System.out.println("Hay un total de "+iContadorPrimos+" números primos");


        sc.close();
    }
}
