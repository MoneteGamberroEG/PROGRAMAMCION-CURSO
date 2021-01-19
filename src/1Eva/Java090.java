
public class Java090 {

    public static void main(String arg[]) {

        //hacer función multiplicar mediante sumas función recursiva
        int resultado = multiplicar(5, 3);
        System.out.println(resultado);
    }

    public static int multiplicar(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a + multiplicar(a, b - 1);
        }
    }
}
