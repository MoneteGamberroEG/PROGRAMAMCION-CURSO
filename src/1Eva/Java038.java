
public class Java038 {

    public static void main(String arg[]) {

        //cambiar a la tabla 2 las filas por las columnas de la tabla 1
        int tabla1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int tabla2[][] = new int[4][4];

        //tabla2 = tabla1;
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2.length; j++) {

                tabla2[i][j] = tabla1[j][i];
                System.out.printf("%d", tabla2[i][j]);
            }
            System.out.println(" ");
        }

    }
}
