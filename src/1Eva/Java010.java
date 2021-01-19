
public class Java010 {

    public static void main(String arg[]) {

        //Factorial de un número
        //Ascendente
        int numero = 7;
        int acum = 1;

        for (int cont = 1; cont <= numero; cont++) {
            acum = acum * cont;// acum*= cont
        }
        System.out.println("Factorial de " + numero + " es " + acum);

    }
}
