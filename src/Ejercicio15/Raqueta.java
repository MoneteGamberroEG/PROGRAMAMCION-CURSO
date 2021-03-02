package Ejercicio15;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

public class Raqueta extends Bloque{
    public static final int VELX=5;
    Point p = MouseInfo.getPointerInfo().getLocation();
    public Raqueta(){
        super(120,189, 10, 60, Color.white);
    }
    public void mover(int direccion){
       if(direccion == Arkonoid.DERECHA)
           x += VELX;
       else 
           x -= VELX;
       if(x<=0)
           x=0;
       if(x>=240)
           x=240;
           
    }
}
