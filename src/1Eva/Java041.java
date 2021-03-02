
public class Java041 {

    public static void main(String arg[]) {

        //sacar la media de goles por temporada de cada futbolista
        int goles[][] = {{18, 19, 22, 33, 20}, {22, 24, 19, 18, 21}, {19, 10, 16, 18, 15}, {23, 14, 15, 16, 28}};
        String futbolistas[] = {"Messi", "Ronaldo", "Grizzman", "Suarez", "Neymar"};
        double acum;

        for (int j = 0; j < futbolistas.length; j++) {
            acum = 0;
            for (int i = 0; i < goles.length; i++) {
                acum += goles[i][j];
            }
            System.out.printf("La media de goles de %s es %.1f por temporada\n", futbolistas[j], acum / goles.length);
        }

    }
}
