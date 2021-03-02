package Ejercicio15;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Arkonoid extends Applet implements Runnable{
    public static final int COLUMNAS= 10;
    public static final int FILAS = 5;
    public static final int DERECHA=0;
    public static final int IZQUIERDA=1;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List <Bloque>bloques;
    Color colores[]= {Color.yellow ,Color.blue, Color.lightGray, Color.red, Color.magenta};
    Pelota pelota;
    Raqueta raqueta;
    
    public void init() {
       imagen = this.createImage(300,200);
       noseve = imagen.getGraphics();
       bloques= new ArrayList<Bloque>();
       for(int i= 0; i<COLUMNAS; i++){
           for(int j= 0; j<FILAS ; j++)
                bloques.add(new Bloque(1+(30*i), 10+(12*j), 10, 28, colores[j]));
       }
       pelota = new Pelota();
       raqueta = new Raqueta();
       
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
    public void run(){
        do{
           /*if(raqueta.intersects(pelota)== true)
             pelota.setVelY(-pelota.getVelY());*/
           pelota.actualizar(raqueta, bloques);
           repaint();
            try{
            Thread.sleep(25);
            }catch(InterruptedException e){}
            
        }while(true);
    }
    public void paint(Graphics g){
       noseve.setColor(Color.black);
       noseve.fillRect(0, 0, 300, 300);
       for(int i = 0; i<bloques.size(); i++)
            bloques.get(i).dibujar(noseve);
       pelota.dibujar(noseve);
       raqueta.dibujar(noseve);
       g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
      paint(g);  
    }
   /* public void intersect(){
        for(int i = 0; i<bloques.size(); i++)
            if(bloques.get(i).intersects(pelota) == true){
                bloques.remove(i);  
                pelota.rebota(raqueta);
            }
        if(raqueta.intersects(pelota)== true)
            pelota.rebota(raqueta);
   }*/
     public boolean keyDown(Event ev, int tecla){
        if(tecla == 1006)
            raqueta.mover(IZQUIERDA);
        if(tecla == 1007)
            raqueta.mover(DERECHA);
        repaint();
        return true;     
   }

}
