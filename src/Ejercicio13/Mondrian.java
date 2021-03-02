package Ejercicio13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian extends Applet implements Runnable {

    public static final int ARRIBA = 0, ABAJO = 1, IZQUIERDA = 2, DERECHA = 3;

    Thread animacion;
    int posX, posY, direccion;
    Image imagen;
    Graphics noseve;

    public void init() {
        posX = 80;
        posY = 100;
        direccion = DERECHA;

        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();

        resize(325, 300);
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void run() {
        do {
            actualiar();
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        } while (true);
    }

    public void actualiar() {
        switch (direccion) {
            case ARRIBA:
                posY--;
                if (posY <= 100) {
                    direccion = IZQUIERDA;
                }
                break;
            case ABAJO:
                posY++;
                if (posY >= 120) {
                    direccion = DERECHA;
                }
                break;
            case DERECHA:
                posX++;
                if (posX >= 100) {
                    direccion = ARRIBA;
                }
                break;
            case IZQUIERDA:
                posX--;
                if (posX <= 80) {
                    direccion = ABAJO;
                }
                break;
        }
    }

    public void paint(Graphics graphics) {
        noseve.setColor(Color.yellow);
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(260, 0, 40, 190);
        noseve.setColor(Color.blue);
        noseve.fillRect(80, 200, 220, 90);
        noseve.fillRect(100, 10, 90, 80);
        noseve.setColor(Color.lightGray);
        noseve.fillRect(posX, posY, 110, 90);
        noseve.setColor(Color.red);
        noseve.fillRect(0, 100, 70, 190);
        noseve.fillRect(200, 0, 45, 45);
        noseve.setColor(Color.magenta);
        noseve.fillRect(200, 55, 45, 135);

        graphics.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics graphics) {
        paint(graphics);
    }

}