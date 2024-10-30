import java.util.Scanner;

public class Ejercicio18 {
    public static void ejercicio(){
        int iContador=0;
        int iNumeroIntroducido;
        int arriMemoria[] = new int[2];

        arriMemoria[0]=0;   //Aquí guardo la altura máxima.
        arriMemoria[1]=0;   //Aquí guardo la posición del árbol con la altura máxima.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del árbol a analizar:");
        iNumeroIntroducido =sc.nextInt();
        sc.nextLine();

        if(iNumeroIntroducido>=0){
            arriMemoria[0]=iNumeroIntroducido;
            arriMemoria[1]=iContador;

           while (iNumeroIntroducido!=-1){
                iContador++;

               System.out.println("Introduce la altura del árbol a analizar:");
               iNumeroIntroducido =sc.nextInt();
               sc.nextLine();

               if(iNumeroIntroducido>arriMemoria[0]){
                   arriMemoria[0]=iNumeroIntroducido;
                   arriMemoria[1]=iContador;
               }
           }

        }
        System.out.printf("El árbol más alto mide "+arriMemoria[0]+"cm, que corresponde con la etiqueta "+arriMemoria[1]);

        sc.close();
    }
}
