
public class Java073 {

    public static void main(String arg[]) {

        /*eliminar un caracter cada vez que aparezca en la frase, incluida su posición,
         * no usar una cadena auxiliar (sin la n)
         */
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char caracter = 'n';

        int longitud = frase.length;
        for (int i = 0; i < longitud; i++) {
            if (frase[i] == caracter) {
                for (int z = i; z < longitud - 1; z++) {
                    frase[z] = frase[z + 1];
                }
                frase[longitud - 1] = ' ';
                longitud--;
            }
        }
        System.out.println(frase);
    }
}
