package Ejercicio17;

import java.awt.*;

public class Palabra extends Rectangle{
    //public static final int VELX=-1;
    Color color;
    String palabras;
    
    public Palabra(String p){
    super(Principal.POSINICIAL,(int)(Math.random()*270), 20, 50);
    color = Color.PINK;
    this.palabras = p;
    }
    public void dibujar(Graphics g, int NE){
         g.setColor(color);
         g.fillRect(x, y, height, width);
         g.setColor(Color.BLACK);
         g.drawString(this.palabras, x+10, y+20);
        
    }
    public boolean actualizar(boolean go){
        x --;
        if(x<=0)
            go = true;
        return go;
    }
}
