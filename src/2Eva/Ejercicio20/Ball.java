package Ejercicio20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Rectangle {

    double velX, velY;
    Color[] colores = {Color.BLUE, Color.MAGENTA, Color.CYAN, Color.GREEN, Color.ORANGE, Color.WHITE, Color.PINK};
    Color color;

    public Ball() {
        super(100, 100, 12, 12);
        velX = -1;
        velY = -1;
        color = colores[((int) ((Math.random()) * colores.length))];
    }

    public void dbujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    public void actualizar(Racket r1, Racket r2) {
        x += velX;
        y += velY;
        if (this.intersects(r1) || this.intersects(r2)) {
            velY = -velY;
            velX = -velX;
            color = colores[((int) ((Math.random()) * colores.length))];
        }
        if (y < 24 || y > 188) {
            velY = -velY;
        }

    }
}
