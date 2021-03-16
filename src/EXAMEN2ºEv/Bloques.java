
import java.awt.*;
import java.util.Random;

public class Bloques extends Rectangle {

    public static Color[] COLORES = {Color.red, Color.black, Color.green, Color.blue, Color.yellow, Color.cyan, Color.magenta, Color.orange};
    private Color color;
    int speedX = -3;

    public Bloques(int x, int y, int height) {
        super(x, y, 35, height);
        color = COLORES[new Random().nextInt(COLORES.length)];
    }

    public void update() {
        this.x += speedX;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

}
