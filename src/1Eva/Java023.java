
public class Java023 {									//combinar ejercicios 21 y 22

    public static void main(String arg[]) {
        int[] datos = {10, 20, 30, 40, 50, 60};

        for (int x = 0; x < datos.length; x++) {
            int guardar = datos[datos.length - 1];
            for (int i = datos.length - 1; i > 0; i--) {
                datos[i] = datos[i - 1];

            }
            datos[0] = guardar;
            for (int j = 0; j < datos.length; j++) {
                System.out.printf("%d  ", datos[j]);

            }
            System.out.println();
        }
    }
}
