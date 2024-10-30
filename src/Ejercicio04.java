import java.util.Scanner;

public class Ejercicio04 {
    public static void ejercicio(){
        int iProducto;

        Scanner sc = new Scanner(System.in);

        for(int i=7; i<100; i++){
            if(i%7==0){
                System.out.println(i);
            }

        }

        sc.close();
    }
}
