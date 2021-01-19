
public class Java025 {

    public static void main(String arg[]) {

        //Sacar todas las tablas de multiplicar del 1 al 9 usando un bucle
        int[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] multiplos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x = 0; x < multiplos.length; x++) {
            for (int i = 0; i < datos.length; i++) {
                System.out.print(datos[i] * multiplos[x] + "  ");
            }
            System.out.println();

        }
    }
}
