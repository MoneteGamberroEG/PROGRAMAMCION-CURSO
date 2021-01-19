
public class Java047 {

    public static void main(String arg[]) {

        //sumar todos los salarios
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 80, 784}, {1500, 1950, 1880, 1978, 2200, 2100}};
        System.out.println(suma(salarios));
    }

    public static int suma(int salarios[][]) {
        int sumasalarios = 0;
        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[i].length; j++) {
                sumasalarios += salarios[i][j];
            }
        }
        return sumasalarios;
    }
}
