package EXAMEN2ºEv;


import java.awt.*;
import java.util.Random;

public class Granizo extends Rectangle {

    public Granizo() {
    super(new Random().nextInt(Ejercicioexamen.SIZE), 0, 15, 15);
    }

    public boolean update(jugador player) {
        if (player.intersects(this)) {
            return true;
        }
        this.y += 3;
        return false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(this.x, this.y, this.width, this.height);
    }

}
