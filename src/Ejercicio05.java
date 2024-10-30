import java.util.Scanner;

public class Ejercicio05 {
    public static void ejercicio(){
        int iSumatorio=0;

        Scanner sc = new Scanner(System.in);

        for (int i=3; i<=456;i=i+3){
            iSumatorio=iSumatorio+i;
            if(i!=456){
                System.out.print(i+", ");
            }else{
                System.out.print(i+" ");
            }
        }
        System.out.print("La suma de todos los número es: "+iSumatorio);

        //sc.close();
    }
}
