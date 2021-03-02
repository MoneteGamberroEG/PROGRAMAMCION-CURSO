
public class Java040 {

    public static void main(String arg[]) {

        //intercambiar las diagonales de la tabla
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int inter;
        for (int i = 0; i < tabla.length; i++) {
            inter = tabla[i][i];
            tabla[i][i] = tabla[i][tabla.length - 1 - i];
            tabla[i][tabla.length - 1 - i] = inter;
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%d", tabla[i][j]);
            }
            System.out.println();
        }

    }
}
