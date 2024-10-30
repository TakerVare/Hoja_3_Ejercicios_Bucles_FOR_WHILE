import java.util.Scanner;

public class Ejercicio17 {
    public static void ejercicio(){
        int iResultadoFactorial=1;
        int iNumeroIntroducido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para calcular el factorial");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        if(iNumeroIntroducido>0){
            for (int i=1; i<=iNumeroIntroducido; i++){
                iResultadoFactorial = iResultadoFactorial*i;
            }

        }
        System.out.printf("El factorial de "+iNumeroIntroducido+" es igual a: "+iResultadoFactorial);


        sc.close();
    }
}
