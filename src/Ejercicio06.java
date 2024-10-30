import java.util.Scanner;

public class Ejercicio06 {
    public static void ejercicio(){
        int iNumeroIntroducido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<iNumeroIntroducido; i=i+2){
            System.out.println(i);

        }

        //sc.close();
    }
}
