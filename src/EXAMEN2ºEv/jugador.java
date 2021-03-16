package EXAMEN2ºEv;


import java.awt.*;
import java.util.List;

public class jugador extends Rectangle {

    public jugador(int x, int y, int height, int width) {
        super(x, y, width, height);
    }

    public boolean update(List<Bloques> bloques) {
        for (int i = 0; i < bloques.size(); i++) {
            if (Bloques.get(i).intersects(this)) {
                return false;
            }
        }
        this.y += 2;
        return this.y >= Ejercicioexamen.SIZE;
    }

    public void moveRight() {
        this.x += 3;
    }

    public void moveLeft() {
        this.x -= 3;
    }

    public void jump() {
        this.y -= 15;
    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(this.x, this.y, this.height, this.width);
    }

}
