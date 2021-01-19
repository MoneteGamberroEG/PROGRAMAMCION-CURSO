
public class Java084 {

    public static void main(String arg[]) {

        //ordenar alfabéticamente 
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[];

        int cont = 0, posicion = frase.indexOf(" ");
        while (posicion != -1) {
            cont++;
            posicion = frase.indexOf(" ", posicion + 1);
        }
        vector = new String[cont];

        int i = 0, inicio = 0;
        int fin = frase.indexOf(" ");
        while (fin != -1) {
            vector[i] = frase.substring(inicio, fin);
            i++;
            inicio = fin + 1;
            fin = frase.indexOf(" ", fin + 1);
        }

        String inter;
        for (int j = 0; j < vector.length - 1; j++) {
            for (int k = vector.length - 1; k > j; k--) {
                if (vector[k].compareTo(vector[k - 1]) < 0) {
                    inter = vector[k];
                    vector[k] = vector[k - 1];
                    vector[k - 1] = inter;
                }
            }
        }

        frase = "";
        for (int x = 0; x < vector.length; x++) {
            frase = frase.concat(vector[x]);
        }
        System.out.println(frase);
    }
}
