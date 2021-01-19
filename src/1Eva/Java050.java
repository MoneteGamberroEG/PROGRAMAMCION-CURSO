
public class Java050 {

    public static void main(String arg[]) {

        //ordenar con el metodo ordenar cada vector de salario llamando 4 veces a la función ordenar
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170}, {1500, 1950, 1880, 1978, 2200, 2100}};
        for (int i = 0; i < salarios.length; i++) {
            ordenar(salarios[i]);
        }

        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[i].length; j++) {
                System.out.printf(" %d ", salarios[i][j]);
            }
            System.out.println();
        }
    }

    public static void ordenar(int v[]) {
        int inter;
        for (int x = 0; x < v.length; x++) {
            for (int i = v.length; i > x; i--) {
                if (v[i] < v[i - 1]) {
                    inter = v[i];
                    v[i] = v[i - 1];
                    v[i - 1] = inter;
                }
            }
        }
    }
}
