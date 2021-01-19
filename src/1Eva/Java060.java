
public class Java060 {

    public static void main(String arg[]) {

        //pasar las minusculas a mayusculas
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};

        aMayusculas(frase);

        System.out.println(frase);
    }

    public static void aMayusculas(char[] fr) {
        for (int i = 0; i < fr.length; i++) {
            fr[i] = Character.toUpperCase(fr[i]);
        }
    }
}
