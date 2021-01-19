
public class Java099 {

    public static void main(String arg[]) {

        // un numero es primo si solamente es divisible por si mismo y por el número, realizar una funcion que reciba un entero positivo y devuelva si es primo o no 
        if (esPrimo(13)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
