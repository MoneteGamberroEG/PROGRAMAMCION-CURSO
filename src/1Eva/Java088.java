
public class Java088 {

    public static void main(String arg[]) {

        //reemplazar todos los espacios por un espacio
        String frase1 = "Había     una   vez    un     circo";

        //frase1 = frase1.replaceAll(" +", " ");
        //System.out.println(frase1);
        boolean primero = true;
        int i = 0;
        while (i < frase1.length()) {
            if (frase1.charAt(i) == ' ') {
                if (primero) {
                    primero = false;
                    i++;
                } else {
                    frase1 = frase1.substring(0, i).concat(frase1.substring(i + 1, frase1.length()));
                }
            } else {
                i++;
                primero = true;
            }
        }
        System.out.println(frase1);
    }
}
