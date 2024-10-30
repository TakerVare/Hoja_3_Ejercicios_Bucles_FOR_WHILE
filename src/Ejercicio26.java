import java.util.Scanner;

public class Ejercicio26 {
    private static final int ciDistancia = 1500;
    public static void ejercicio(){
        double arridMarca[] = new double[2];
        double dVelocidad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los minutos de la marca del atleta:");
        arridMarca[0]=sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduce los segundos de la marca del atleta:");
        arridMarca[1]=sc.nextDouble();
        sc.nextLine();
        System.out.println();

        do{
            dVelocidad=(double) (ciDistancia/((arridMarca[0]*60)+arridMarca[1]));
            System.out.print((int) (arridMarca[0])+" m "+(int) (arridMarca[1])+" s con velocidad media de ");
            System.out.printf("%.2f m/sg\n", dVelocidad);

            System.out.println("Introduce los minutos de la marca del atleta:");
            arridMarca[0]=sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce los segundos de la marca del atleta:");
            arridMarca[1]=sc.nextInt();
            sc.nextLine();
            System.out.println();


        }while (arridMarca[0]!=0 && arridMarca[1]!=0);



        sc.close();
    }
}
