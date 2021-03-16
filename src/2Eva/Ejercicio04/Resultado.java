package Ejercicio04;

public class Resultado {

    static private int resultado[][];
    static Bombo bombo;

    public static void main(String[] args) {
        bombo = new Bombo();
        resultado = new int[6][8];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = bombo.sacaBola();
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.println();
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf(" %d   ", resultado[i][j]);
            }

        }
    }

}
