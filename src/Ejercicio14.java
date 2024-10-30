import java.util.Scanner;

public class Ejercicio14 {
    public static void ejercicio(){
        int iNumeroIntroducido=1;
        int iSumatorio=0;
        int iContador=0;
        int iContadorMayoresEdad=0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        while (iNumeroIntroducido>=0){
            iSumatorio=iSumatorio+iNumeroIntroducido;
            iContador++;
            if(iNumeroIntroducido>=18){
                iContadorMayoresEdad++;
            }
            System.out.println("Introduce un número:");
            iNumeroIntroducido =sc.nextInt();
            sc.nextLine();
        }

        System.out.println("La suma de las edades de todos los alumnos es: "+iSumatorio);
        System.out.println("Hemos introducido la edad de "+iContador+" alumnos");
        System.out.println("La edad media de los alumnos es: "+(iSumatorio/iContador));
        System.out.println("Hay "+iContadorMayoresEdad+" mayores de edad");
        sc.close();
    }
}
