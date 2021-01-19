
public class Java061 {

    public static void main(String arg[]) {

        //cambiar las "a" de la frase por "x"
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'a';
        char sustituto = 'x';

        sustitucion(frase, sustituir, sustituto);

        System.out.println(frase);
    }

    public static void sustitucion(char[] fr, char s1, char s2) {
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] == s1) {
                fr[i] = s2;
            }
        }
    }
}
