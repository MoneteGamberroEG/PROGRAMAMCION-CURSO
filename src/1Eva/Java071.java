
public class Java071 {

    public static void main(String arg[]) {

        //primero encontrar la subcadena 1 dentro de frase y contamos cuantas veces ej:64
        // sustituir la subcadena 1 por la subcadena 2
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'e', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcad1[] = {'e', 'n', ' '};
        char subcad2[] = {'x', 'x', 'x', 'x', 'x'};
        char cadena2[] = new char[150];

        int iS;

        for (int i = 0, j = 0; i < frase.length; i++, j++) {
            if (frase[i] == subcad1[0]) {
                iS = 1;
                while ((iS < subcad1.length) && (subcad1[iS] == frase[i + iS])) {
                    iS++;
                }
                if (iS == subcad1.length) {
                    for (int z = 0; z < subcad2.length; z++) {
                        cadena2[j++] = subcad2[z];
                    }

                    j--;
                    i += subcad1.length - 1;
                } else {
                    cadena2[j] = frase[i];
                }
            } else {
                cadena2[j] = frase[i];
            }
        }
        System.out.println(cadena2);
    }
}
