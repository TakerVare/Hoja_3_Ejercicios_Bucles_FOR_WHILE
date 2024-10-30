import java.util.Scanner;
public class Ejercicio01 {
    public static void ejercicio(){
        int iNumero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número");
        iNumero= sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=iNumero; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
