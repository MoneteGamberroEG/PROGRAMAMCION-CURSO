
public class Java097 {

    public static void main(String arg[]) {

        //ley dhont
        final int ESCANOS = 7;
        String partidos[] = {"PSOE", "PP", "VOX", "UP", "Cs", "MAP"};
        int votos[] = {157420, 119421, 91978, 57398, 46645};
        int cociente[] = {1, 1, 1, 1, 1, 1};
        int posMax = 0;

        for (int i = 0; i < ESCANOS; i++) {
            posMax = 0;
            for (int j = 1; j < partidos.length; j++) {
                if ((votos[j] / cociente[j]) > (votos[posMax] / cociente[posMax])) {
                    posMax = j;
                }
            }
            cociente[posMax]++;
        }
        for (int i = 0; i < partidos.length; i++) {
            System.out.println(partidos[i] + "ha obtenido " + (cociente[i] - 1) + "escaños");
        }
    }
}
