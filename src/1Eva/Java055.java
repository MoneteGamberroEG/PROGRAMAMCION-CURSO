
public class Java055 {

    public static void main(String arg[]) {

        // se crea un array bidimensional que multiplicara los kilos por los precios
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 21, 12, 7, 11}};
        int precios[] = {6, 7};
        int ventas[][] = new int[2][7];
        cargarventas(kilos, precios, ventas);
        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                System.out.printf(" %d ", ventas[i][j]);
            }
            System.out.println();
        }
    }

    public static void cargarventas(int k[][], int p[], int v[][]) {
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                v[i][j] = k[i][j] * p[i];
            }
        }

    }
}
