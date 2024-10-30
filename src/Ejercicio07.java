import java.util.Scanner;
import java.math.BigInteger;

public class Ejercicio07 {
    public static void ejercicio(){
        int iSumatorio=0;
        double dProducto=1;
        BigInteger biProducto = new BigInteger("1");



        for (int i=20; i<=400; i=i+2){
            iSumatorio=iSumatorio+i;
            dProducto=dProducto*i;
            biProducto = biProducto.multiply(BigInteger.valueOf(i));
        }

        System.out.println("La suma de los números pares comprendidos entre 20 y 400, es igual a: "+iSumatorio);
        System.out.println("El producto de los números pares comprendidos entre 20 y 400, es igual a: "+dProducto);
        System.out.println("El producto de los números pares comprendidos entre 20 y 400, es igual a: "+biProducto);
        //sc.close();
    }
}
