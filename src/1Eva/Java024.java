
public class Java024 {

    public static void main(String arg[]) {

        //multiplicar el 3, 5, 7 por cada número del vector
        int[] datos = {10, -20, 30, -40, 50, 60};
        int multiplos[] = {3, 5, 7};

        for (int x = 0; x < multiplos.length; x++) {
            for (int i = 0; i < datos.length; i++) {
                System.out.print(datos[i] * multiplos[x] + "  ");
            }
            System.out.println();

        }
    }
}
