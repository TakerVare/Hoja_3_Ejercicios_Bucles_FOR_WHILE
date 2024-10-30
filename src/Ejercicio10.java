import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio(){
        int iNumeroIntroducidoUno;
        int iNumeroIntroducidoDos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 2 y 9:");
        iNumeroIntroducidoUno = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce otro número entre 2 y 9:");
        iNumeroIntroducidoDos = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<iNumeroIntroducidoUno; i++){
            if(i%iNumeroIntroducidoDos!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
