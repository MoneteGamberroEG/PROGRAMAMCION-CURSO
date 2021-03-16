package Ejercicio18;

import java.awt.*;

public class Gun extends Rectangle {

    //int[] xp;
    //int[] yp;
    public Gun() {
        super(130, 170, 10, 30);
    }

    public void dbujar(Graphics g) {
        g.setColor(Color.YELLOW);
        //xp = new int[] { 10, 30, 20};
        //yp = new int[] { 50, 40, 30};
        g.fillRect(x, y, width, height);
        //g.fillPolygon(xp, yp, x); Intento de poligono en vez de rectangulo

    }
}
