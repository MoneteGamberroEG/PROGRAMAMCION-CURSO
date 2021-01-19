
public class Java043 {

    public static void main(String arg[]) {

        //ordenar recorriendo el vector buscando el más pequeño e intercambiarlo a la primera posición 
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int inter;

        for (int x = 0; x < vector.length - 1; x++) {

            int posmin = x;
            for (int i = x + 1; i < vector.length; i++) {
                if (vector[i] < vector[posmin]) {
                    posmin = i;
                }
            }
            inter = vector[posmin];
            vector[posmin] = vector[x];
            vector[x] = inter;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }
}
