
public class Java081 {

    public static void main(String arg[]) {

        //sacar cuantas "a" hay en la frase
        String frase[] = {"En un lugar", "lugar de la Mancha", ",de cuyo nombre", " no quiero acordarme"};
        int cont = 0;

        for (int i = 0; i < frase.length; i++) {
            for (int x = 0; x < frase[i].length(); x++) {
                if (frase[i].charAt(x) == 'a')//devuelve el caracter
                {
                    cont++;
                }
            }
        }
        System.out.printf("Hay %d aes", cont);
    }
}
