import java.math.BigInteger;

public class Ejercicio08 {
    public static void ejercicio(){
        int iSumatorio=0;

        for (int i=1; i<=25; i++){
            iSumatorio=iSumatorio+(i*i);
        }
        System.out.println("La suma de los cuadrados de los primeros 25 números naturales es: "+iSumatorio);
        //sc.close();
    }
}
