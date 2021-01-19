
public class Java030 {

    public static void main(String arg[]) {
        int tabla[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        String productos[] = {"Naranjas", "Peras", "Melones"};
        int kilos = 0;

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                kilos = kilos + tabla[i][j];
            }
            System.out.printf("He vendido %d kilos de %s \n", kilos, productos[i]);
            kilos = 0;

        }
    }
}
