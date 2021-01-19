
public class Java059 {

    public static void main(String arg[]) {

        //hacer una función que rellene fraseMod con la frase pero en vez de espacio escriba una x y luego un espacio
        //Enx unx lugarx dex lax manchax
        char frase[] = {'E', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char fraseMod[] = new char[50];

        modificarFrase(frase, fraseMod);
        char frase2[] = modificarFrase2(frase);

        System.out.println(fraseMod);
        System.out.println(frase2);
    }

    public static void modificarFrase(char fr[], char[] fM) {

        for (int i = 0, i2 = 0; i < fr.length; i++, i2++) {
            if (fr[i] == ' ') {
                fM[i2] = 'x';
                i2++;
            }
            fM[i2] = fr[i];

        }

    }

    public static char[] modificarFrase2(char fr[]) {
        char fM[] = new char[50];
        for (int i = 0, i2 = 0; i < fr.length; i++, i2++) {
            if (fr[i] == ' ') {
                fM[i2] = 'x';
                i2++;
            }
            fM[i2] = fr[i];

        }
        return fM;
    }
}
