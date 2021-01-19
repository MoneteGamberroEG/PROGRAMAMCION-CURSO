
public class Java016 {

    public static void main(String arg[]) {

        //tenemos un vector de 5 enteros, calcular el maximo y el minimo actuando unicamente con los valores y unicamente con  los indices
        int datos[] = {-17, -55, -33, -21, -41};
        int maximo = datos[0];
        int minimo = datos[0];
        int posmax = 0;
        int posmin = 0;

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
        }
        System.out.printf("El valor m�ximo es : %d y el m�nimo es : %d\n\n", maximo, minimo);

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > datos[posmax]) {
                posmax = i;
            }
            if (datos[i] < datos[posmin]) {
                posmin = i;
            }
        }
        System.out.printf("El valor m�ximo es : %d y el m�nimo es : %d\n\n", datos[posmax], datos[posmin]);

    }
}
