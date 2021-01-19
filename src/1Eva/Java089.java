
public class Java089 {

    public static void main(String arg[]) {

        //poner una palabra en cada frase A o B usando buleanos
        String frase1 = "Había una vez un circo ";
        String fraseA = "";
        String fraseB = "";

        int inicio = 0;
        int fin = frase1.indexOf(" ");
        boolean enFA = true;

        while (fin != -1) {
            if (enFA) {
                fraseA = fraseA.concat(frase1.substring(inicio, fin + 1));
                enFA = false;
            } else {
                fraseB = fraseB.concat(frase1.substring(inicio, fin + 1));
                enFA = true;
            }
            inicio = fin + 1;
            fin = frase1.indexOf(" ", inicio);
        }
        System.out.println(fraseA);
        System.out.println(fraseB);
    }
}
