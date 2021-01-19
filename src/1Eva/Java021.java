
public class Java021 {

    public static void main(String arg[]) {

        //desplazamos todos los elementos hacia la derecha y el ultimo pasa al primero
        int[] datos = {10, -20, 30, -40, 50, 60};
        int guardar = datos[datos.length - 1];
        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = guardar;
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%d  ", datos[i]);
        }

    }
}
