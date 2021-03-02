package Ejercicio18;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;

public class SpaceInvaders extends Applet implements Runnable{
    public static final int NUMINVAD = 7;
    public static final int MILISEC = 25;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Invader> invaders;
    int milisegundos;
    int numInvaders=0;
    List<Bullet> bullets;
    Gun gun;
    
    public void init() {
       imagen = this.createImage(300,200);
       noseve = imagen.getGraphics();
       invaders = new ArrayList<Invader>();
       invaders.add(new Invader());
       bullets = new ArrayList<Bullet>();
       gun = new Gun();
       for(int i= 0; i<NUMINVAD; i++)
           invaders.add(new Invader());
    }
    
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
     
    public void run(){
        do{
           milisegundos += MILISEC;
           if(milisegundos>=2000){
               invaders.add(new Invader());
               milisegundos=0;
           }
           
           for(int i=0; i<invaders.size(); i++)
            invaders.get(i).actualizar();
           
           for(int i=0; i<bullets.size(); i++)
            bullets.get(i).actualizar(bullets, i);
           
           interseccion();
           repaint();
            try{
            Thread.sleep(MILISEC);
            }catch(InterruptedException e){}
            
        }while(true);
    }
        
    public void paint(Graphics g){
       noseve.setColor(Color.DARK_GRAY);
       noseve.fillRect(0, 0, 300, 200);
       
        for(int i=0; i<invaders.size(); i++)
         invaders.get(i).dbujar(noseve);
        
        for(int i=0; i<bullets.size(); i++)
         bullets.get(i).dbujar(noseve);
        
         if(invaders.size()==0){
            noseve.setColor(Color.GREEN);
            noseve.drawString("WIN!!", 120, 130);
            g.drawImage(imagen, 0, 0, this);
            animacion.stop();
            return;
            //No me borra las balas pero nvrmnd
         }
         
         gun.dbujar(noseve);
         g.drawImage(imagen, 0, 0, this);
    }
    
    public void update(Graphics g){
      paint(g);  
    }
    
     public boolean mouseDown(Event ev, int x,int y){
        bullets.add(new Bullet(x));
        repaint();
        return true;     
    }
     
       public boolean mouseMove(Event ev, int x,int y){
        gun.x= x-5 ;
        repaint();
        return true;     
    }
       
     public void interseccion(){
         for(int i = 0; i <invaders.size(); i++)//Aqui esta el error, al disparar muchas de vez. Eliminamos una nave, pero el bucle sigue con el tamaño anterior tengo que salir de los bucles.
              for(int j = 0; j < bullets.size(); j++)
                  if(invaders.get(i).intersects(bullets.get(j))){
                      invaders.remove(i);
                      bullets.remove(j);
                      break;
                  }
                   
    }
}



