package Ejercicio21;

import java.awt.*;
import java.applet.Applet;
import java.util.ArrayList;

public class Tablero extends Applet implements Runnable{
    public final int TIEMPO=25;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Ball> balls;
    boolean gameover;
    int counter=0;
    public void init() {
       imagen = this.createImage(300,200);
       noseve = imagen.getGraphics();
       balls = new ArrayList<Ball>();
       balls.add(new Ball(50, 100, 150));
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
    public void run(){
        do{
           counter+=TIEMPO;
           for(int i =0; i<balls.size(); i++)
                balls.get(i).actualizar();
           repaint();
            try{
            Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
            
        }while(true);
    }
    public void paint(Graphics g){
       noseve.setColor(Color.DARK_GRAY);
       noseve.fillRect(0, 0, 300, 200);
       noseve.setColor(Color.MAGENTA);
       noseve.drawString("TIME: "+ (30-(counter/1000)), 10, 20);
       
       for(int i =0; i<balls.size(); i++)
           balls.get(i).dbujar(noseve);
       if(balls.isEmpty()&&counter<30000){
           noseve.setColor(Color.GREEN);
           noseve.drawString("WIN", 150, 100);
           animacion.stop();
       }
       if(counter>30000){
           noseve.setColor(Color.RED);
           noseve.drawString("Game Over", 150, 100);
           animacion.stop();
       }

       g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
      paint(g);  
    }
     public boolean mouseDown(Event ev, int x, int y ){
        for(int i=0; i<balls.size(); i++)
            if(balls.get(i).contains(x,y)){//!!!!!!!!!!!!!!!!
              if(balls.get(i).width>13){
                balls.add(new Ball(balls.get(i).height/2, balls.get(i).x,balls.get(i).y+balls.get(i).width/4));
                balls.add(new Ball(balls.get(i).height/2, balls.get(i).x + balls.get(i).width/2, balls.get(i).y+balls.get(i).width/4));
              }
              balls.remove(i);
              break;
            }
        repaint();
        return true;     
   }
}
