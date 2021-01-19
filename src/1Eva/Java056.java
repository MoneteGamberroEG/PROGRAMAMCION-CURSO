
public class Java056 {

    public static void main(String arg[]) {

        // sacar cuantos kilos de peras y manzanas has vendido
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 21, 12, 7, 11}};
        String productos[] = {"Peras", "Manzanas"};
        int sumaDeKilos[] = sumarkilos(kilos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println(sumaDeKilos[i] + " kilos de " + productos[i] + " vendidas");
        }
    }

    public static int[] sumarkilos(int kilos[][]) {
        int vector[] = {0, 0};
        for (int i = 0; i < kilos.length; i++) {
            for (int j = 0; j < kilos[i].length; j++) {
                vector[i] += kilos[i][j];
            }
        }
        return vector;

    }
}
