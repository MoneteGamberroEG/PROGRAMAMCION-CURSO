
public class Java032 {

    //Cual fue el mejor dia y peor dia de la semana de las 4 salas (sabado con tantas entradas)
    public static void main(String arg[]) {
        int salas[][] = {{10, 20, 30, 40, 150, 230, 243}, {50, 60, 70, 80, 175, 200, 170}, {90, 100, 110, 120, 130, 125, 110}, {30, 110, 50, 120, 130, 100, 153}};
        String productos[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int aux[] = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < salas.length; i++) {
            for (int k = 0; k < productos.length; k++) {
                aux[k] += salas[i][k];
            }
        }
        int max = 0, min = 0;
        for (int i = 1; i < aux.length; i++) {
            if (aux[max] < aux[i]) {
                max = i;
            }
        }
        for (int i = 1; i < aux.length; i++) {
            if (aux[min] > aux[i]) {
                min = i;
            }
        }
        System.out.println("El dia que mas se ha vendido es el " + productos[max] + " con " + aux[max] + " entradas vendidas");
        System.out.println("El dia que menos se ha vendido es el " + productos[min] + " con " + aux[min] + " entradas vendidas");
    }
}
