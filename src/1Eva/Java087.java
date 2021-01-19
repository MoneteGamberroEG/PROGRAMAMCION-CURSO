
public class Java087 {

    public static void main(String arg[]) {

        //Cambiar los espacios por "a "
        String frase1 = "Había una vez un circo que alegraba siempre el corazón ";

        //frase1 = frase1.replace(" ", "a ");
        //System.out.println(frase1);
        int posicion = frase1.indexOf(" ");
        while (posicion != -1) {
            frase1 = frase1.substring(0, posicion).concat("a").concat(frase1.substring(posicion, frase1.length()));
            posicion = frase1.indexOf(" ", posicion + 2);
        }
        System.out.println(frase1);
    }
}
