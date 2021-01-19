
public class Java066 {

    public static void main(String arg[]) {

        //mover todas las letras a la derecha y la ultima de cada palabra ponerla la primera
        //mover todas las letras a la izquierda y la ultima de cada palabra ponerla la última
        char frase[] = {'E', 'n', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;
        char intercambio;

        while (fin < frase.length) {
            while (frase[fin] != ' ') {
                fin++;
            }
            //despDerecha(frase, inicio, fin);
            despIzquierda(frase, inicio, fin);
            inicio = fin + 1;
            fin++;
            //inicio = ++fin; Es equivalente a las 2 líneas anteriores
        }
        System.out.println(frase);
    }

    public static void despDerecha(char[] frase, int ini, int fin) {
        char intercambio = frase[fin - 1];
        for (int i = fin - 1; i > ini; i--) {
            frase[i] = frase[i - 1];
        }
        frase[ini] = intercambio;
    }

    public static void despIzquierda(char[] frase, int ini, int fin) {
        char intercambio = frase[ini];
        for (int i = ini; i < fin - 1; i++) {
            frase[i] = frase[i + 1];
        }
        frase[fin - 1] = intercambio;
    }
}
