
package Ejercicio16;

import java.awt.*;
import java.util.List;
import java.applet.Applet;

public class Bird extends Rectangle{
    Color color;
    double velY;
    public Bird(){
        super(50, 50, 15, 15);
        color = Color.PINK;
        velY= 1;
        
    }
     public void dibujar(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
     public void actualizar(List<Column> c, Applet a){
         y += velY;
         //if((c.get(0).rectangle1.intersects(this)) || (c.get(0).rectangle1.intersects(this)) )
                // y = 0;
     }
}
