
public class Java013 {

    public static void main(String arg[]) {

        // división       
        int dividendo = 13;
        int divisor = 3;
        int cont = 0;
        int resto = dividendo;
        while (resto >= divisor) {
            cont++;
            resto -= divisor;
        }
        System.out.println(dividendo + ":" + divisor + " = " + cont);
    }
}
