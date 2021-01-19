package Eva1;

public class Java053 {

    public static void main(String arg[]) {

        //hacer una funcion que modifique cada elemento de la tabla multiplicandolo por el multiplicador
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int multiplicador = 4;
        mult(tabla, multiplicador);

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }

    }

    public static void mult(int tabla[][], int mult) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] *= mult;
            }
        }
    }
}
