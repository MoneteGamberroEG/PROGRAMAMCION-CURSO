
public class Java083 {

    public static void main(String arg[]) {

        //Usando los metodos anteriores, dejar la frase sin espacios
        String frase = "Había una vez, un circo, que alegraba siempre el corazón";

        int posicion = frase.indexOf(" ", 0);
        while (posicion != -1) {
            frase = frase.substring(0, posicion).concat(frase.substring(posicion + 1, frase.length()));
            posicion = frase.indexOf(" ", posicion + 1);
        }
        System.out.println(frase);
    }
}
