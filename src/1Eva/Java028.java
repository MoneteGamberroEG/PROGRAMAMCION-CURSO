
public class Java028 {

    public static void main(String arg[]) {

        //multiplicar los elementos del primer vector de la tabla por 2, segundo vector por 4, tercero por 6
        int tabla[][] = {{10, 20, -30, -40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        int v1[] = {2, 4, 6};
        for (int i = 0; i < tabla.length; i++) {
            for (int k = 0; k < tabla[i].length; k++) {
                System.out.printf("%d , ", (tabla[i][k] * v1[i]));
            }
            System.out.println();
        }
    }
}
