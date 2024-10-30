import java.util.Scanner;

public class Ejercicio20 {
    public static void ejercicio(){
        double dNotaIntroducida;
        int iNumeroSuspensos=0;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<6;i++){
            System.out.println("Introduce la "+i+"º nota.");
            dNotaIntroducida=sc.nextDouble();
            sc.nextLine();
            if(dNotaIntroducida<5){
                iNumeroSuspensos++;
            }
        }

        if(iNumeroSuspensos>0){
            System.out.println("Hay "+iNumeroSuspensos+" suspensos.");
        }else{
            System.out.println("No hay suspensos.");
        }




        sc.close();
    }
}
