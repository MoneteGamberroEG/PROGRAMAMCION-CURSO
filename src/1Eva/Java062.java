
public class Java062 {

    public static void main(String arg[]) {

        //hacer una función que sustituya las "n" por xx
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'n';
        char sustituto[] = {'x', 'x'};

        char fraseMod[] = sustitucion(frase, sustituir, sustituto);

        System.out.println(fraseMod);
    }

    public static char[] sustitucion(char[] fr, char s1, char s2[]) {
        char frase2[] = new char[100];
        for (int x = 0, y = 0; x < fr.length; x++, y++)//la x me sirve como indice para recorrer frase y la y me sirve para saber donde estoy
        {
            if (fr[x] == s1) {
                for (int j = 0; j < s2.length; j++) {
                    frase2[y] = s2[j];
                    y++;
                }
            } else {
                frase2[y] = fr[x];
                y++;
            }
        }
        return frase2;
    }
}
