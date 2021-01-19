
public class Java070 {

    public static void main(String arg[]) {

        // escribir en cadena2 primero la frase del derecho y despues del revés
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];

        int i;
        for (i = 0; i < frase.length; i++) {
            cadena2[i] = frase[i];
        }

        for (int j = i - 1; j >= 0; j--, i++) {
            cadena2[i] = frase[j];
        }

        System.out.println(cadena2);
    }
}
