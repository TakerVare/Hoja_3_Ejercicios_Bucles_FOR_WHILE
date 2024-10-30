import java.util.Scanner;

public class Ejercicio11 {
    public static void ejercicio(){
        int iCantidadDeNumeros;
        int iNumero[];
        int iAux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuántos números quieres evaluar");
        iCantidadDeNumeros = sc.nextInt();
        sc.nextLine();

        iNumero = new int[iCantidadDeNumeros];
        for(int i=0; i<iCantidadDeNumeros; i++){
            System.out.println("Introduce un número:");
            iNumero[i]=sc.nextInt();
            sc.nextLine();
        }

        for(int i=0; i<iCantidadDeNumeros; i++){
            for(int j=1; j<iCantidadDeNumeros; j++){
                if(iNumero[j-1]<iNumero[j]){
                    iAux=iNumero[j];
                    iNumero[j]=iNumero[j-1];
                    iNumero[j-1]=iAux;
                }
            }
        }

        System.out.println("Mayor: "+iNumero[0]);
        System.out.println("Menor: "+iNumero[iCantidadDeNumeros-1]);

        sc.close();
    }
}
