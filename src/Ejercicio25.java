import java.util.Scanner;

public class Ejercicio25 {
    public static void ejercicio(){
        String sNumeroIntroducido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de tres cifras:");
        sNumeroIntroducido=sc.nextLine();

        for (int i=0; i<sNumeroIntroducido.length(); i++){
            System.out.println(sNumeroIntroducido.charAt(i));
        }

        sc.close();
    }
}
