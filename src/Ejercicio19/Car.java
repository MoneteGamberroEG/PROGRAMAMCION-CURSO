package Ejercicio19;

import java.awt.*;
import java.util.List;

public class Car extends Rectangle{
    int velX;
    Color[] colores = {Color.BLUE, Color.MAGENTA, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW, Color.RED, Color.WHITE, Color.PINK, Color.BLACK}; 
    Color color; 
    int direccion;
   public Car(int px, int py, int d, int velocidad){
        super( px, py , 20,10);
        velX= velocidad;
        color = colores[((int)((Math.random())*colores.length))];
        direccion = d;
    }
   
    public void dbujar(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public void actualizar(List c, int i){
        if(direccion == 1){
           x -= velX;
           if(x<0)
               c.remove(i);
        }
        
        if(direccion == 0){
            x += (velX);
            if(x>300)
               c.remove(i);
        }
    }
    
    
}

