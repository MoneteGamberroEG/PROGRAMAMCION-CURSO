package Ejercicio22;

import java.awt.*;
import java.applet.Applet;

public class Space extends Applet implements Runnable {

    Thread animacion;
    Image imagen;
    Graphics noseve;
    Ship spaceShip;

    public void init() {
        imagen = this.createImage(300, 200);
        noseve = imagen.getGraphics();
        spaceShip = new Ship();
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void run() {
        do {
            repaint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }

        } while (true);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 300, 200);
        spaceShip.dbujar(noseve);
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event ev, int tecla) {
        repaint();
        return true;
    }
}
