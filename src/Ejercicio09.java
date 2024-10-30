import java.util.Scanner;

public class Ejercicio09 {
    public static void ejercicio(){
        int iNumeroIntroducido;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número mayor que 4:");
        iNumeroIntroducido = sc.nextInt();
        sc.nextLine();

        for (int i=4; i<=iNumeroIntroducido; i=i+4){
            System.out.println(i);
        }
        sc.close();
    }
}
