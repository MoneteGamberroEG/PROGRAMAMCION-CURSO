
public class Java063 {

    public static void main(String arg[]) {

        //hacer una funcion que sustituya las n por xxr desplazando hacia la derecha el resto de la frase
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'n';
        char sustituto[] = {'X', 'X', 'R'};
        char frase2[] = new char[100];

        for (int i = 0; i < frase.length; i++) {
            frase2[i] = frase[i];
        }

        sustitucion(frase2, sustituir, sustituto, frase.length);

        System.out.println(frase2);
    }

    public static void sustitucion(char[] fr, char s1, char s2[], int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (fr[i] == s1) {
                fr[i] = s2[0];
                for (int x = 0; x < s2.length - 1; x++) {
                    for (int j = longitud; j > i; j--) {
                        fr[j] = fr[j - 1];
                    }
                    longitud++;
                    fr[++i] = s2[x + 1];
                }
            }
        }
    }
}
