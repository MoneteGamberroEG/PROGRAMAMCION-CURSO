
public class Java067 {

    public static void main(String arg[]) {

        //ir rellenando cadena2 encontrar el carcter "a" y sustituirlo por la subcadena (a,b,c,d,e)
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char caracter = 'a';
        char subCadena[] = {'A', 'B', 'C', 'D', 'E'};
        char cadena2[] = new char[150];

        for (int i = 0, j = 0; i < frase.length; i++, j++) {
            if (frase[i] != caracter) {
                cadena2[j] = frase[i];
            } else {
                for (int z = 0; z < subCadena.length; z++) {
                    cadena2[j++] = subCadena[z];
                }
                j--;
            }

        }
        System.out.println(cadena2);

    }
}
