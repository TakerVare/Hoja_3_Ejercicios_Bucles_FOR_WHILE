import java.io.PipedOutputStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int iEjercicio;
        Scanner sc =new Scanner(System.in);

        System.out.println("Selecciona un ejercicio:");
        iEjercicio = sc.nextInt();
        sc.nextLine();

        switch (iEjercicio){
            case 1:
                Ejercicio01.ejercicio();
                break;
            case 2:
                Ejercicio02.ejercicio();
                break;
            case 3:
                Ejercicio03.ejercicio();
                break;
            case 4:
                Ejercicio04.ejercicio();
                break;
            case 5:
                Ejercicio05.ejercicio();
                break;
            case 6:
                Ejercicio06.ejercicio();
                break;
            case 7:
                Ejercicio07.ejercicio();
                break;
            case 8:
                Ejercicio08.ejercicio();
                break;
            case 9:
                Ejercicio09.ejercicio();
                break;
            case 10:
                Ejercicio10.ejercicio();
                break;
            case 11:
                Ejercicio11.ejercicio();
                break;
            case 12:
                Ejercicio12.ejercicio();
                break;
            case 13:
                Ejercicio13.ejercicio();
                break;
            case 14:
                Ejercicio14.ejercicio();
                break;
            case 15:
                Ejercicio15.ejercicio();
                break;
            case 16:
                Ejercicio16.ejercicio();
                break;
            case 17:
                Ejercicio17.ejercicio();
                break;
            case 18:
                Ejercicio18.ejercicio();
                break;
            case 19:
                Ejercicio19.ejercicio();
                break;
            case 20:
                Ejercicio20.ejercicio();
                break;
            case 21:
                Ejercicio21.ejercicio();
                break;
            case 22:
                Ejercicio22.ejercicio();
                break;
            case 23:
                Ejercicio23.ejercicio();
                break;
            case 24:
                Ejercicio24.ejercicio();
                break;
            case 25:
                Ejercicio25.ejercicio();
                break;
            case 26:
                Ejercicio26.ejercicio();
                break;
            case 31:
                EjemplosClase.ejercicio();
                break;
            case 32:
                EjemplosClase_2.ejercicio();
                break;
            case 33:
                EjemplosClase_3.ejercicio();
                break;
            default:
                System.out.println("No hay ningún ejercicio asociado a este número:");
                break;

        }

    }
}