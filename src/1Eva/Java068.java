
public class Java068 {

    public static void main(String arg[]) {

        //meter frase en cadena2 2 veces frase
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];
        int i;
        for (i = 0; i < frase.length; i++) {
            cadena2[i] = frase[i];
        }

        for (int j = 0; j < frase.length; j++, i++) {
            cadena2[i] = frase[j];
        }

        System.out.println(cadena2);
    }
}
