
public class Java046 {

    public static void main(String arg[]) {

        //Sacar el maximo de un vector utilizando una función aparte
        int vector[] = {24, 45, 65, 12, 7, 123, 16, 50};
        int vector2[] = {24, 45, 65, 12, 17, 123, 16, 50};
        System.out.printf("El máximo es del primer vector es %d\n", maximo(vector));
        System.out.printf("El máximo es del segundo vector es %d\n", maximo(vector2));
    }

    public static int maximo(int[] v1) {
        int posmax = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[posmax] < v1[i]) {
                posmax = i;
            }

        }
        return v1[posmax];
    }
}
