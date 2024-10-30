import java.util.Scanner;

public class Ejercicio03 {
    public static void ejercicio(){
        for(int i=1; i<10; i++){
            System.out.println("TABLA DEL "+i);
            for(int j=1; j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
    }
}
