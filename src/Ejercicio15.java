import java.util.Scanner;

public class Ejercicio15 {
    public static void ejercicio(){
        int iNumeroIntroducido=1;
        int iNumeroSecreto;
        boolean bNumeroAcertado=false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 100 que tendremos que adivinar:");
        iNumeroSecreto =sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un número:");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        while (bNumeroAcertado==false && iNumeroIntroducido>=0){

            if(iNumeroIntroducido>iNumeroSecreto){
                System.out.println("Mayor");
            } else if (iNumeroIntroducido< iNumeroSecreto) {
                System.out.println("Menor");
            }else{
                System.out.println("Correcto");
                bNumeroAcertado=true;
            }

            System.out.println("Introduce un número:");
            iNumeroIntroducido =sc.nextInt();
            sc.nextLine();
        }


        sc.close();
    }
}
