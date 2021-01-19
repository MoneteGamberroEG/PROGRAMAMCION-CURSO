
public class Java010_des {

    public static void main(String arg[]) {
        //Factorial de un número
        //Descendente
        int numero = 7;
        int acum = 1;

        for (int cont = numero; cont >= 1; cont--) {
            acum = acum * cont;// acum*= cont
        }
        System.out.println("Factorial de " + numero + " es " + acum);

    }
}
