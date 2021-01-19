
public class Java049 {

    public static void main(String arg[]) {

        //ordenar el vector
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        ordenar(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
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
