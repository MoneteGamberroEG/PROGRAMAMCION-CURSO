
public class Java007 {

    public static void main(String arg[]) {

        //calcular si un numero es multiplo de otro
        int x, y, aux;
        x = 8;
        y = 4;
        aux = 0;
        if (x < y) {
            aux = y;
            y = x;
            x = aux;

        }

        if ((x % y) == 0) {
            System.out.println(x + " es multiplo de " + y);
        } else {
            System.out.println(x + " no es multiplo de " + y);
        }
    }
}
