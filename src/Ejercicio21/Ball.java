package Ejercicio21;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Rectangle{
 double velX, velY;  
 Color[] colores = {Color.BLUE, Color.MAGENTA, Color.CYAN, Color.GREEN, Color.ORANGE, Color.WHITE, Color.PINK}; 
 Color color; 
    public Ball(int d, int px, int py){
        super(px,py, d, d);
        color = colores[((int)((Math.random())*colores.length))];
        velX=(int)(Math.random()*7)-3;
        velY=(int)(Math.random()*7)-3;
        
    }
     public void dbujar(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
     public void actualizar(){
       x += velX;
       y += velY;
       if(y<=0||y>200-width){
        velY=-velY;
        //color=colores[((int)((Math.random())*colores.length))];
       }
        if(x<=0||x>300-width){
        velX=-velX;
        velY=-velY;
        //color=colores[((int)((Math.random())*colores.length))];
       }
       
    }
}
