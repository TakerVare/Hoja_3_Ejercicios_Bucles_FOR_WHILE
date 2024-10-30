public class EjemplosClase_3 {
    public static void ejercicio(){
        //Dos formas de declarar un array, son iguales
        int[][] arritablaUno;
        int[][] arritablaDos;
        int[][] arritablaTres;

        arritablaUno = new int[3][3];
        arritablaDos = new int[3][3];
        arritablaTres = new int[3][3];

        for(int i=0; i<arritablaUno.length; i++){
            for(int j=0; j<arritablaUno[0].length; j++){
                arritablaUno[i][j] = (int) (Math.random()*10);
                arritablaDos[i][j] = (int) (Math.random()*10);
                arritablaTres[i][j] = arritablaUno[i][j]+arritablaDos[i][j];
                System.out.print(" "+ arritablaTres[i][j]);
            }
            System.out.println();
        }

    }
}
