import java.util.Scanner;

public class Ejercicio12 {
    public static void ejercicio(){
        int iNumeroIntroducido=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        while (iNumeroIntroducido!=0){
            if(iNumeroIntroducido%2==0){
                System.out.println("El número "+iNumeroIntroducido+" es par");
            }
            else{
                System.out.println("El número "+iNumeroIntroducido+" es impar");
            }
            if(iNumeroIntroducido>0){
                System.out.println("El número "+iNumeroIntroducido+" es positivo");
            }
            else{
                System.out.println("El número "+iNumeroIntroducido+" es negativo");
            }
            System.out.println("El cuadrado de "+iNumeroIntroducido+" es: "+(iNumeroIntroducido*iNumeroIntroducido));

            System.out.println("Introduce un número:");
            iNumeroIntroducido =sc.nextInt();
            sc.nextLine();

        }

        sc.close();
    }
}
