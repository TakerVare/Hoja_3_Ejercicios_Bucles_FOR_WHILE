import java.util.Scanner;

public class Ejercicio21 {
    public static void ejercicio(){
        double dNotaIntroducida;
        int iNumeroSuspensos=0;
        int iNumeroCondicionados=0;
        int iNumeroAprobados=0;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<7;i++){
            System.out.println("Introduce la "+i+"º nota.");
            dNotaIntroducida=sc.nextDouble();
            sc.nextLine();
            if(dNotaIntroducida>=5){
                iNumeroAprobados++;
            }else if(dNotaIntroducida>=4){
                iNumeroCondicionados++;
            }else{
                iNumeroSuspensos++;
            }
        }


        System.out.println("Hay "+iNumeroSuspensos+" suspensos.");
        System.out.println("Hay "+iNumeroCondicionados+" condicionados.");
        System.out.println("Hay "+iNumeroAprobados+" aprobados.");




        sc.close();
    }
}
