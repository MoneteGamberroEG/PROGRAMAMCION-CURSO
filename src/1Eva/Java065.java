
public class Java065 {

    public static void main(String arg[]) {

        /*misma frase y el ultimo caracter es un espacio en blanco, 
        * de cada palabra de la frase tenemos que intercambiar el ultimo carcter 
        * de la palabra con el primer caracter de la palabra
         */
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;
        char intercambio;

        while (fin < frase.length) {
            while (frase[fin] != ' ') {
                fin++;
            }
            intercambio = frase[inicio];
            frase[inicio] = frase[fin - 1];
            frase[fin - 1] = intercambio;
            inicio = fin + 1;
            fin++;
            //inicio = ++fin; Es un equivalente a las 2 líneas anteriores
        }
        System.out.println(frase);
    }
}
