
public class Java027 {

    //recorrer todos los elementos del vector y cambiar los los negativos por positivos y los positivos multiplicarlos por 5
    public static void main(String arg[]) {
        int tabla[][] = {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        for (int i = 0; i < tabla.length; i++) {
            for (int k = 0; k < tabla[i].length; k++) {
                if (tabla[i][k] < 0) {
                    tabla[i][k] *= -1;
                } else {
                    tabla[i][k] *= 5;
                }
                System.out.print(tabla[i][k] + " ");
            }
            System.out.println();
        }
    }
}
