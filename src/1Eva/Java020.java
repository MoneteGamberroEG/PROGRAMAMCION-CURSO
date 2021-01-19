
public class Java020 {

    public static void main(String arg[]) {

        //todos los elemnetos deben desplazarse una posicion a la izquierda excepto el primero que pasa a la ultima posición 
        int[] datos = {10, -20, 30, -40, 50, 60};
        int acum = datos[0];
        for (int i = 0; i < datos.length; i++) {
            datos[i - 1] = datos[i];
        }
        datos[datos.length - 1] = acum;
        for (int i = 0; i < datos.length; i++) {
            System.out.printf(" %d - ", datos[i]);
        }

    }
}

//desplazamos todos los elementos hacia la derecha y el ultimo pasa al primero
