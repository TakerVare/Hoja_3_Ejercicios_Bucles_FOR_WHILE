public class EjemplosClase_2 {
    public static void ejercicio(){
        //Dos formas de declarar un array, son iguales
        int[] arritablaUno;
        int[] arritablaDos;
        int[] arritablaTres;

        arritablaUno = new int[10];
        arritablaDos = new int[10];
        arritablaTres = new int[30];

        for(int i=0; i<arritablaUno.length; i++){
            arritablaUno[i] = (int) (Math.random()*10);
            arritablaDos[i] = arritablaUno[i];
        }

        int iContadorArray=0;

        for(int i=0; i<(arritablaUno.length); i++){
            arritablaTres[(3*i)]= arritablaUno[i];
            arritablaTres[((3*i)+1)]= arritablaDos[i];
            arritablaTres[((3*i)+2)]= (arritablaUno[i]+arritablaDos[i]);
            //i++;
        }

        for (int i=0; i<arritablaTres.length; i++){
            System.out.println(arritablaTres[i]);
        }

    }
}
