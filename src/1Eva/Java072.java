
public class Java072 {

    public static void main(String arg[]) {

        //invertir las palabras (mancha la de lugar un en)
        char frase[] = {' ', 'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[150];
        int fin = frase.length - 1;
        int inicio = fin;
        int pos = 0;//indice para frase2

        //bucle principal tendrá tantas interaciones como palabras tenga frase
        while (inicio > 0) {
            while (frase[inicio] != ' ') {
                inicio--;
            }
            for (int i = inicio; i <= fin; i++) {
                frase2[pos] = frase[i];
                pos++;
            }
            inicio = fin = inicio - 1;
        }
        System.out.println(frase2);
    }
}
