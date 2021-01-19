
public class Java042 {

    public static void main(String arg[]) {

        //metodo de ordenación de la burbuja
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int inter;
        for (int x = 0; x < vector.length - 1; x++) {
            for (int i = vector.length - 1; i - x > 0; i--) {
                if (vector[i] < vector[i - 1]) {
                    inter = vector[i];
                    vector[i] = vector[i - 1];
                    vector[i - 1] = inter;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.printf(" %d ", vector[i]);
        }
    }
}
