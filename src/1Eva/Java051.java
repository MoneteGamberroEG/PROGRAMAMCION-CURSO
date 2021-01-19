
public class Java051 {

    public static void main(String arg[]) {

        //factorial de un número y la llamamos tres veces {C 2(arriba) 5(abajo)}
        int a = 5;
        int b = 2;
        int resultado = factorial(a) / (factorial(a - b) * factorial(b));
        System.out.printf("Combianciones de %d elemnetos tomados de %d en %d resulta %d", a, b, b, resultado);
    }

    public static int factorial(int x) {
        int acum = 1;
        for (int i = 1; i <= x; i++) {
            acum *= i;
        }
        return acum;
    }
}
