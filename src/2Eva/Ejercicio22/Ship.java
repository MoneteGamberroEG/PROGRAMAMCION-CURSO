package Ejercicio22;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Ship extends Rectangle {

    public Ship() {
        super(100, 150, 50, 50);
    }

    public void dbujar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);
    }

}
