
public class Java082 {

    public static void main(String arg[]) {

        // cambiar la subcadena
        //String replace(String, String)
        //String concat (String)
        String frase[] = {"en un lugar", "lugar de la Mancha", ",de cuyo nombre", " no quiero acordarmen"};
        String subCadena = "en";

        for (int i = 0; i < frase.length; i++) {
            frase[i] = frase[i].replace(subCadena, subCadena.toUpperCase()); //toUpperCase es para poner en mayuscula
        }
        frase[0] = frase[0].concat("hola");

        for (int i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
        }
    }
}
