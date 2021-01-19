
public class Java058 {

    public static void main(String arg[]) {

        //sacar el numero de palabras teniendo en cuenta que están separadas por espacios
        char frase[] = {'E', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int ne = contar(frase);
        System.out.printf("El número de palabras es %d", ne + 1);
    }

    public static int contar(char[] fr) {
        int cont = 0;
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] == ' ') {
                cont++;
            }
        }

        return cont;
    }
}
