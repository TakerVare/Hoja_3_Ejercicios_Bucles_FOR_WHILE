import java.util.Scanner;

public class EjemplosClase {
    public static void ejercicio(){
        //Dos formas de declarar un array, son iguales
        int[] arritablaUno;
        int[] arritablaDos;
        int[] arritablaTres;

        arritablaUno = new int[10];
        arritablaDos = new int[10];
        arritablaTres = new int[20];

        for(int i=0; i<arritablaUno.length; i++){
            arritablaUno[i] = (int) (Math.random()*10);
            arritablaDos[i] = arritablaUno[i];
        }

        for(int i=0; i<(arritablaUno.length); i++){
            arritablaTres[(2*i)]= arritablaUno[i];
            arritablaTres[((2*i)+1)]= arritablaDos[i];
        }

        for (int i=0; i<arritablaTres.length; i++){
            System.out.println(arritablaTres[i]);
        }

    }
}
