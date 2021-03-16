package Ejercicio18;

import java.awt.*;

public class Invader extends Rectangle {

    int velX;
    Color[] colores = {Color.BLUE, Color.MAGENTA, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW, Color.RED, Color.WHITE, Color.PINK, Color.BLACK};
    Color color;

    public Invader() {
        super((int) (Math.random() * 250), (int) (Math.random() * 100), 35, 5);
        velX = -((int) ((Math.random()) * 5) + 1);
        color = colores[((int) ((Math.random()) * 10))];
    }

    public void dbujar(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void actualizar() {
        x += velX;
        if ((x > 265) || (x <= 0)) {
            velX = -velX;
        }

    }

}
