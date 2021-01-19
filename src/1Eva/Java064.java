
public class Java064 {

    public static void main(String arg[]) {

        // realizar una funcion q devuelva el numero de veces que una subcadena se encuentra dentro de de una cadena
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'n', 'n', 'n', 'n', 'r', ' ', 'n', 'n', 'n', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcadena[] = {'n', 'n', 'n'};
        int contador = 0;
        int iS;
        for (int i = 0; i < (frase.length - subcadena.length); i++) {
            if (frase[i] == subcadena[0]) {
                iS = 1;
                while ((iS < subcadena.length) && (subcadena[iS] == frase[i + iS])) {
                    iS++;
                }
                if (iS == subcadena.length) {
                    contador++;
                }
            }
        }
        System.out.println("Subcadena encontrada " + contador + " veces");
    }
}
