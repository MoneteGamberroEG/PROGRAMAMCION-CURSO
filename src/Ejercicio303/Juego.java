package Ejercicio303;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable{ 
    public static final int TIEMPO = 30;
    Image imagen;
    Graphics noseve;
    Image robin;
    RobinHood robinHood;
    Image globoImg;
    ArrayList<Globo> globos;
    Thread animacion;
    int contaTiempo = 0;
    Image flechaImg;
    ArrayList<Flecha> flechas;
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        robin = getImage(getCodeBase(), "./Ejercicio303/Imagenes/robin.jpg");
        robinHood = new RobinHood(robin);
        flechaImg = getImage(getCodeBase(), "./Ejercicio303/Imagenes/flecha.png");
        globoImg = getImage(getCodeBase(), "./Ejercicio303/Imagenes/globo.png");
        globos = new ArrayList<Globo>();
        globos.add(new Globo(globoImg));
        flechas = new ArrayList<Flecha>();
    }
     public void paint(Graphics g){
         noseve.setColor(Color.white);
         noseve.fillRect(0, 0, 700, 500);
         robinHood.paint(noseve, this);
         for(int i=0; i<globos.size(); i++)
             globos.get(i).dibujaGlobo(noseve, this);
         for(int i=0; i<flechas.size(); i++)
             flechas.get(i).dibujar(noseve, this);
         g.drawImage(imagen, 0, 0, this);
     }
    public void update(Graphics g){
      paint(g);  
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
        public void run(){
            do{
                contaTiempo += TIEMPO;
                if(contaTiempo >= 1000){
                    contaTiempo = 0;
                    globos.add(new Globo(globoImg));
                }
                for(int i=0; i<globos.size(); i++){
                     globos.get(i).actualizar();
                     if(globos.get(i).y < -200)
                         globos.remove(i);   
                }
         for(int i=0; i<flechas.size(); i++){
             flechas.get(i).actualizar();
             if(flechas.get(i).getX() > 700)
                 flechas.remove(i);
         }
         for(int i=0; i<flechas.size(); i++)
             for(int j=0; j<globos.size(); j++)
                 if(globos.get(j).contains(flechas.get(i).punta()))
                     globos.remove(j);
                repaint();
                    try{
                        Thread.sleep(TIEMPO);
                }catch(InterruptedException e){}
            }while(true);
        }
    public boolean mouseMove(Event ev, int x, int y){
        robinHood.setY(y);
        repaint();
            return true;
    }
    public boolean mouseDown(Event ev, int x, int y){
        flechas.add(new Flecha(flechaImg, y-5));
        return true;
    }
    

}
