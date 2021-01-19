
public class Java074 {

    public static void main(String arg[]) {

        //eliminar subcadena
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char subCadena[] = {'e', 'n', ' '};
        int longitud = frase.length - 1, cont;

        for (int i = 0; i < longitud - subCadena.length; i++) {
            if (frase[i] == subCadena[0]) {
                cont = 1;
                while (frase[i + cont] == subCadena[cont] && cont < subCadena.length - 1) {
                    cont++;
                }
                if (cont == subCadena.length - 1) {
                    for (int z = 0; z < subCadena.length; z++) {
                        for (int k = i; k < longitud; k++) {
                            frase[k] = frase[k + 1];
                        }
                        frase[longitud - z] = ' ';
                    }
                    longitud -= subCadena.length;
                }
            }
        }
        System.out.print(frase);
    }
}
