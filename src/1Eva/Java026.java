
public class Java026 {   //poner los vectores en una tabla

    public static void main(String arg[]) {
        int tabla[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        for (int i = 0; i < tabla.length; i++) {
            for (int k = 0; k < tabla[i].length; k++) {
                System.out.print(tabla[i][k] + " ");
            }
            System.out.println();
        }

    }
}
