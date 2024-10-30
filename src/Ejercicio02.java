import java.util.Scanner;

public class Ejercicio02 {
    public static void ejercicio(){
        //Hacerlo con un while
        int iProducto=1;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<20; i+=2){
            iProducto=iProducto* i;
        }

        System.out.println(iProducto);

        sc.close();
    }
}
