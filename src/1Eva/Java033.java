
public class Java033 {

    public static void main(String arg[]) {

        //Que pelicula mas y cual menos
        int salas[][] = {{10, 20, 30, 40, 150, 230, 243}, {50, 60, 70, 80, 175, 200, 170}, {90, 100, 110, 120, 130, 125, 110}, {30, 110, 50, 120, 130, 100, 153}};
        String productos[] = {"El resplandor", "Spiderman", "La naranja mecanica", "La cuarta jaja"};
        int aux[] = {0, 0, 0, 0};
        for (int i = 0; i < aux.length; i++) {
            for (int k = 0; k < salas[i].length; k++) {
                aux[i] += salas[i][k];
            }
            System.out.println(aux[i] + " para " + productos[i]);
        }
        int max = 0, min = 0;
        for (int k = 1; k < aux.length; k++) {
            if (aux[max] < aux[k]) {
                max = k;
            }
            if (aux[min] > aux[k]) {
                min = k;
            }
        }
        System.out.println("La pelicula mas vista es " + productos[max] + " con " + aux[max] + " entradas compradas");
        System.out.println("La pelicula menos vista es " + productos[min] + " con " + aux[min] + " entradas compradas");
    }
}
