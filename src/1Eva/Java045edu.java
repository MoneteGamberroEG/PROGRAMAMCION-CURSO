
public class Java045edu {

    public static void main(String arg[]) {

        //buscar el maximo en un vector doble
        int datos[][] = {{5, 10, 20, 30}, {35, 400, 45, 50}, {55, 65, 60, 70}};
        int max = 0;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (max < datos[i][j]) {
                    max = datos[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
