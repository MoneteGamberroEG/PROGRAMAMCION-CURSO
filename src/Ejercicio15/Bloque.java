package Ejercicio15;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Bloque extends Rectangle{
    Color color;
    public Bloque(int posx, int posy, int anchura, int altura, Color c){
        super(posx,posy, altura, anchura);
        color= c;
    }
     public void dibujar(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
