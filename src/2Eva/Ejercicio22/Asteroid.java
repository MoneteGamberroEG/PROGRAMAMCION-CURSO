package Ejercicio22;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Asteroid extends Rectangle {

    int px = 0;
    int py = 0;

    public Asteroid() {
        super(0, 0, 10, 10);
        px = (int) Math.random();
        py = (int) Math.random();

    }

    public void dbujar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(px, py, width, height);
    }

}
