
public class Java076 {

    public static void main(String arg[]) {

        // cambiar las mayusculas por minusculas y al reves, pero solo las vocales
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'U', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'A', 'n', 'c', 'h', 'a', ' '};

        for (int i = 0; i < cadena.length; i++) {
            switch (cadena[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    cadena[i] = Character.toLowerCase(cadena[i]);
                    break;
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cadena[i] = Character.toUpperCase(cadena[i]);
                default:
                    cadena[i] = '$';
            }
        }
        System.out.println(cadena);
    }
}
