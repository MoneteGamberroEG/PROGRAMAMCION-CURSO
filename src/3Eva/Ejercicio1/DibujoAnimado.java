

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class DibujoAnimado {
    Image[] imagenes;
    int actual;
    
    public DibujoAnimado(Image[] imgs){
        imagenes = imgs;
        actual = 0;
    }
    public void paint(Graphics g, Applet ap){
        g.drawImage(imagenes[actual], 100, 10, 50, 100, ap);
    }
    public void actualizar(){
        actual = (actual +1) % 4;
    }
}
