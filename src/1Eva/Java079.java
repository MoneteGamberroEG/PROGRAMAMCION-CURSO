
public class Java079 {

    public static void main(String arg[]) {

        //extraer subcadena de la cadena que empieza en la posición 7 y acaba en la 17
        String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        int inicio = 7;
        int fin = 17;

        System.out.println("La subcadena contiene : " + frase.substring(inicio, fin));
    }
}
