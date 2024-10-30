import java.util.Scanner;

public class Ejercicio19 {
    public static void ejercicio(){
        int iNumeroIntroducido;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduce un número entre 1 y 10 para calcular su tabla de multiplicar");
            iNumeroIntroducido =sc.nextInt();
            sc.nextLine();
        }while ((iNumeroIntroducido<1) || (iNumeroIntroducido>10) );

        for(int i=1; i<=10; i++){
            System.out.println(iNumeroIntroducido+" x "+i+" = "+(iNumeroIntroducido*i));
        }

        sc.close();
    }
}
