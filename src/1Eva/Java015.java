
public class Java015 {

    public static void main(String arg[]) {
        int datos[] = {-17, -55, -33, -21, -44};
        int maximo = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
        }
        System.out.printf("El valor máximo es " + maximo);

        //Si los datos son negativos
        //datos[0]es el primer elemento del vector
        maximo = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
        }
        System.out.printf("\nEl valor máximo es " + maximo);

        //Para declarar la posición del maximo
        int posmax = 0;
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > datos[posmax]) {
                posmax = i;
            }
        }

        System.out.printf("\nEl máximo es %d, en la posición %d", datos[posmax], posmax);

        //%d es para referirse al dato que usas más tarde
    }
}
