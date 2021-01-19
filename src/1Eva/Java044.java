
public class Java044 {

    public static void main(String arg[]) {

        //ordenación espacial: ordenamos con un bucle while
        int vector[] = {25, 2, 73, 81, 16};
        int inter;
        int x;
        for (int i = 1; i < vector.length; i++) {
            x = i;
            while ((x > 0) && (vector[x] < vector[x - 1])) {
                inter = vector[x];
                vector[x] = vector[x - 1];
                vector[x - 1] = inter;
                x--;

            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.printf(" %d ", vector[i]);
        }
    }
}
