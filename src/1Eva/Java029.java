
public class Java029 {

    public static void main(String arg[]) {

        //sumar los valores de las filas(v2) y sumar los valores de las columnas(v1)
        int tabla[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        int v1[] = {0, 0, 0, 0};
        int v2[] = {0, 0, 0};

        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                v2[i] = v2[i] + tabla[i][j];
                v1[j] = v1[j] + tabla[i][j];
            }
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < v1.length; j++) {
            System.out.print(v1[j] + " ");
        }
    }
}
