
public class Java075 {

    public static void main(String arg[]) {

        //poner en mayusculas el primer y ultimo carcter de cada palabra 
        char cadena[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;

        while (fin < cadena.length) {
            while (cadena[fin] != ' ') {
                fin++;
            }

            cadena[fin - 1] = Character.toUpperCase(cadena[fin - 1]);
            cadena[inicio] = Character.toUpperCase(cadena[inicio]);

            fin++;
            inicio = fin;
        }
        System.out.println(cadena);
    }
}
