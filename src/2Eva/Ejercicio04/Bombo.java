package Ejercicio04;

import java.util.Random;

public class Bombo {

    private int bolas[];
    Random aleatorio;
    private int numBolas = 48;

    public Bombo() {
        bolas = new int[numBolas];
        for (int i = 0; i < 48; i++) {
            bolas[i] = i + 1;
        }
        aleatorio = new Random();
    }

    public int sacaBola() {
        int numAleatorio, devuelve;
        numAleatorio = aleatorio.nextInt(numBolas);
        devuelve = bolas[numAleatorio];
        bolas[numAleatorio] = bolas[numBolas - 1];
        numBolas--;
        return devuelve;
    }
}
