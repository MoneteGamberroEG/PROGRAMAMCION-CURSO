
package Ejercicio303;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class RobinHood {
    int x;
    private int y;
    Image imagen;
    public RobinHood(Image img){
        imagen = img;
        x = 10;
        y = 200;
        
    }
    public void paint(Graphics dibujo, Applet ap){
        dibujo.drawImage(imagen, x, y, 100, 150, ap);
    
    }
    public void setY(int posY){
        y = posY-50;
        if(y<0) y=0;
        if(y>350) y=350;
    }
    
}
