
public class Java091 {

    public static void main(String arg[]) {

        //factorial con recursividad
        int resultado = factorial(5);
        System.out.println(resultado);
    }

    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}
