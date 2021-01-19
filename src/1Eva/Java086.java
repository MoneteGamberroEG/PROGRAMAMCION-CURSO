
public class Java086 {

    public static void main(String arg[]) {

        //poner una frase escrita al reves
        //usando función Character.toString(char)--->convierte char a String
        String frase1 = "Había una vez un circo que alegraba siempre el corazón";
        String frase2 = "";
        for (int i = frase1.length() - 1; i >= 0; i--) {
            frase2 = frase2.concat(Character.toString(frase1.charAt(i)));
        }
        System.out.println(frase2);
    }
}
