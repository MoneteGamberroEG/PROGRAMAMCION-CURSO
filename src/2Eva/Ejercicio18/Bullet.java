package Ejercicio18;

import java.awt.*;
import java.util.List;

public class Bullet extends Rectangle {

    int velY;

    public Bullet(int cx) {
        super(cx, 200, 5, 7);
        velY = -5;
    }

    public void dbujar(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, width, height);
    }

    public void actualizar(List<Bullet> b, int i) {
        y += velY;
        if (y > 300) {
            b.remove(i);
        }

    }

}
