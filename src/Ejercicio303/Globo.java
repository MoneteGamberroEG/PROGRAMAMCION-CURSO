
package Ejercicio303;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Globo extends Rectangle {
    Image imagen;
    public Globo(Image img){
        super(((int)(Math.random()*150))+500, 500, 70, 100);
        imagen = img;
    }
    
    public void dibujaGlobo(Graphics nsv, Applet ap){
        nsv.drawImage(imagen, x, y, width, height, ap);
    }
    public void actualizar(){
        y -=2;
    }
    
    
}
