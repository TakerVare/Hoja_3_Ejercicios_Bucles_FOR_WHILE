import java.util.Scanner;

public class Ejercicio27 {

    public static void ejercicio(){
        int iPesoIntroducido;
        int iIndiceArray;
        int[] arriPesosAlumnos= new int[] {0,0,0,0};
        int iContadorAlumnos=0;
        float dPorcentaje=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso del alumno");
        iPesoIntroducido=sc.nextInt();
        sc.nextLine();

        while (iPesoIntroducido!=99){

            iIndiceArray=(iPesoIntroducido<40) ? 0 :
            (iPesoIntroducido>=40 && iPesoIntroducido<=50) ?1 :
            (iPesoIntroducido>50 && iPesoIntroducido<60)?2 :
                    3;
            arriPesosAlumnos[iIndiceArray]++;
            iContadorAlumnos++;

            System.out.println("Introduce el peso del alumno");
            iPesoIntroducido=sc.nextInt();
            sc.nextLine();
        }

        for(int i=0; i<arriPesosAlumnos.length; i++){
            switch (i){
                case 0:
                    System.out.print("Nº de alumnos de menos de 40 kg: "+arriPesosAlumnos[i]+" ");
                    break;
                case 1:
                    System.out.print("Nº de alumnos entre 40 y 50 kg: "+arriPesosAlumnos[i]+" ");
                    break;
                case 2:
                    System.out.print("Nº de alumnos de más de 50 kg y menos de 60 kg: "+arriPesosAlumnos[i]+" ");
                    break;
                case 3:
                    System.out.print("Nº de alumnos de más o igual a 60 kg: "+arriPesosAlumnos[i]+" ");
                    break;
            }

            dPorcentaje= (arriPesosAlumnos[i]>0) ? ((float) (arriPesosAlumnos[i]*100)/iContadorAlumnos) : 0;

            System.out.printf("%.2f %%\n", dPorcentaje);
            System.out.println();
        }

        sc.close();
    }
}
