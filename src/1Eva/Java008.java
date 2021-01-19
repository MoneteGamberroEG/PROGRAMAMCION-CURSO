
public class Java008 {

    public static void main(String arg[]) {

        //vamos a realizar una repetición/bucle
        //bucle q sabemos las iteraciones: for(valor inicial: int i=0;cuanto dura el bucle: i<10;i++)
        //cont +=2 es lo mismo q cont=cont +2
        int cont;
        for (cont = 0; cont < 10; cont += 2) {
            System.out.println("Iteración : " + cont);
        }
        System.out.println("Ha salido del bucle porque cont vale " + cont);

    }

}
