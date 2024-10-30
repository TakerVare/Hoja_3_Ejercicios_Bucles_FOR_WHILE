import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio(){
        int iNumeroIntroducidoUno;
        int iNumeroIntroducidoDos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducidoUno = sc.nextInt();
        sc.nextLine();

        do{
            System.out.println("Introduce otro número entre 2 y 9:");
            iNumeroIntroducidoDos = sc.nextInt();
            sc.nextLine();
        }while (iNumeroIntroducidoDos<2 || iNumeroIntroducidoDos >9);


        for (int i=1; i<iNumeroIntroducidoUno; i++){
            if(i%iNumeroIntroducidoDos!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
