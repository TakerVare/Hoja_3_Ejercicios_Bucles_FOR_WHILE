import java.util.Scanner;

public class Ejercicio25 {
    public static void ejercicio(){
        int iHoras=0;
        int iMinutos=0;
        int iSegundos=0;
        int iSegundosIncrementados=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora:");
        iHoras=sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce los minutos:");
        iMinutos=sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce los segundos:");
        iSegundos=sc.nextInt();
        sc.nextLine();

        System.out.println("La hora introducida es: "+iHoras+":"+iMinutos+":"+iSegundos+" Introduce cuántos segundos quieres añadir a esta hora:");
        iSegundosIncrementados=sc.nextInt();
        sc.nextLine();

        if(iSegundosIncrementados>=3600){
            iHoras=iHoras+(iSegundosIncrementados/3600);
            iSegundosIncrementados=iSegundosIncrementados%3600;
        }
        if(iSegundosIncrementados>=60){
            iMinutos=iMinutos+(iSegundosIncrementados/60);
            iSegundosIncrementados=iSegundosIncrementados%60;


        }
        if(iSegundosIncrementados>0){
            iSegundos=iSegundos+iSegundosIncrementados;

        }

        while ((iHoras>=24) || (iMinutos>=60) || (iSegundos>=60)){
            if(iHoras>=24){
                iHoras=iHoras%24;
            }
            if(iMinutos>=60){
                iHoras++;
                iMinutos=iMinutos%60;
            }
            if(iSegundos>=60){
                iMinutos++;
                iSegundos=iSegundos%60;
            }
        }

        System.out.print("La hora resultante después de sumarle "+iSegundosIncrementados+" segundos, es ");
        System.out.printf("%02d:%02d:%02d", iHoras, iMinutos, iSegundos);
        sc.close();
    }
}
