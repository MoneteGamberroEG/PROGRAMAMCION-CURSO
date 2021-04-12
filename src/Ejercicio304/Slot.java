
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Slot {
    public static final int DIMENSION = 48;
    private Image imagen;
    int index;


    public Slot(Image img, int index) {
        imagen = img;
        this.index = index;
    }


    public void paint(Graphics g, Applet ap, int x, int y) {
        g.drawImage(imagen, x * DIMENSION, y * DIMENSION, ap);
    }


    public Image getImagen() {
        return imagen;
    }


    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
}