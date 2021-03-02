package Ejercicio19;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;

public class Road extends Applet implements Runnable{
    public static final int R =0;
    public static final int L =1;
    public static final int TIEMPO= 25;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Car> cars;
    Frog rana;
    int direccion;
    int milisegundos;
    int posRigth[]={103, 116, 129};
    int posLeft[]={60, 72, 87};
    int velocidades[]={4, 5, 6 }; 
    int contador=0;
    
    public void init() {
       imagen = this.createImage(300,200);
       noseve = imagen.getGraphics();
       cars= new ArrayList<Car>();
       rana = new Frog();
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
    public void run(){
        do{
           milisegundos += TIEMPO;
           if((milisegundos%1000)==0){
               crearCoche();
               //milisegundos=0;
           }
           for(int i=0; i<cars.size(); i++)
            cars.get(i).actualizar(cars, i);
           interseccion();
           repaint();
            try{
            Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
            
        }while(true);
    }
    public void paint(Graphics g){
       noseve.setColor(Color.DARK_GRAY);
       noseve.fillRect(0, 0, 300, 200);
       noseve.setColor(Color.LIGHT_GRAY);
       noseve.fillRect(0, 59, 300, 40);
       noseve.fillRect(0, 101, 300, 40);
       noseve.setColor(Color.MAGENTA);
       noseve.drawString("Get 10 points", 20, 20);
       noseve.drawString(contador+" points", 20, 40);
       noseve.drawString("Time Left: "+((60000-milisegundos)/1000), 100, 40);
       for(int i=0; i<cars.size(); i++)
           cars.get(i).dbujar(noseve);
       rana.dbujar(noseve);
       if(contador>=10){
            noseve.setColor(Color.BLACK);
            noseve.drawString("YOU WIN!!", 120, 130);
            g.drawImage(imagen, 0, 0, this);
            animacion.stop();
            return;
       }
       if(milisegundos>=60000 && contador<10){
            noseve.setColor(Color.RED);
            noseve.drawString("GAME OVER", 120, 130);
            g.drawImage(imagen, 0, 0, this);
            animacion.stop();
            return;
       }
       
       g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
      paint(g);  
    }
    private void crearCoche(){
         int n=(int)((Math.random())*3);
               if(Math.random()<0.5){
               cars.add(new Car(0, posRigth[n], R, velocidades[n]));
               }
               else{
                   cars.add(new Car(300, posLeft[n], L, velocidades[n]));
               }
    }
    public boolean keyDown(Event ev, int tecla){
        rana.actualizar(tecla);
        repaint();
        return true;     
   }
       public void interseccion(){
         for(int i = 0; i <cars.size(); i++)
                  if(rana.intersects(cars.get(i))){
                      cars.remove(i);
                      contador++;
                      break;
                  }         
    }
}
