
public class Java054 {

    public static void main(String arg[]) {

        // funcion que modifique el contenido de la tabla kilos, multiplicando cada elemento por el precio que le corresponda
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 21, 12, 7, 11}};
        int precios[] = {6, 7};
        modificar(kilos, precios);
        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                System.out.printf(" %d ", kilos[i][j]);
            }
            System.out.println();
        }
    }

    public static void modificar(int[][] k, int[] p) {
        for (int i = 0; i < k[i].length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                k[i][j] *= p[i];
            }
        }
    }
}
