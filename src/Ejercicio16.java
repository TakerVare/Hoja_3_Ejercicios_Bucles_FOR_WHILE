import java.util.Scanner;

public class Ejercicio16 {
    public static void ejercicio(){
        int iNumeroMaximo;
        int iNumeroMinimo;
        int iNumeroIntroducido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número máximo para el rango:");
        iNumeroMaximo =sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un número mínimo para el rango:");
        iNumeroMinimo =sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un número que esté entre "+iNumeroMinimo+" y "+iNumeroMaximo);
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();


        while (!(iNumeroIntroducido>=iNumeroMinimo && iNumeroIntroducido<=iNumeroMaximo)){
            System.out.println("El número introducido no está comprendido en el rango. Introduce un número que esté entre "+iNumeroMinimo+" y "+iNumeroMaximo);
            iNumeroIntroducido =sc.nextInt();
            sc.nextLine();
        }

        //sc.close();
    }
}
