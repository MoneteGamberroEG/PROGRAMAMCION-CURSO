
public class Java012 {

    public static void main(String arg[]) {

        //variaciones: factorial de uno entre otro
        int elementos = 7;
        int tomados = 4;
        int acum = 1;

        for (int cont = elementos; cont > tomados; cont--) {
            acum *= cont;
        }
        System.out.println("Variaciones de " + elementos + " elementos tomados de " + tomados + " en " + tomados + " = " + acum);
        System.out.printf("Variaciones de %d elementos tomados de %d en %d es %d \n", elementos, tomados, tomados, acum);
        //\n se le llama secuencia de escape
    }
}
