
public class Java057 {

    public static void main(String arg[]) {

        //multiplicar por 5 los kilos menores de 10
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 7, 12, 13, 2, 43}};
        int multiplicador = 5;
        mult(kilos, multiplicador);
        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                System.out.print(kilos[i][j] + "  ");

            }
            System.out.println();
        }
    }

    public static int[][] mult(int kilos[][], int multiplicador) {

        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                if (kilos[i][j] < 10) {
                    kilos[i][j] *= multiplicador;
                }

            }
        }
        return kilos;
    }
}
