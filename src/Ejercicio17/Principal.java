package Ejercicio17;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;

public class Principal extends Applet implements Runnable{
    public static final int POSINICIAL=300;//
    public static final int TIEMPO = 30;//
    Thread animacion;
    Image imagen;
    Graphics noseve;
    String[] frase ={"En", "un", "lugar", "de", "la", "mancha"};
    List<Palabra> palabras;
    //int[] nclick = new int[10];
    int nclick=0;
    boolean gameover = false;
    int milisegundos;
    int contador=1;//posicion de la frase, para saber cual es la proxima palabra a escribir
    
    public void init() {
       imagen = this.createImage(300,300);
       noseve = imagen.getGraphics();
       palabras = new ArrayList<Palabra>();
       palabras.add(new Palabra(frase[0]));
      // for(int i=0; i<frase.length; i++)
       //    palabras.add(new Palabra(frase[i]));
       //for(int i=0; i<frase.length; i++)
         //  nclick[i]=0;
         /*if(gameover){
             animacion.stop();
             repaint();
         }*//*No se para*/
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
    public void run(){
        do{
           milisegundos += TIEMPO;
           if(milisegundos>=1000){
               palabras.add(new Palabra(frase[contador]));
               milisegundos=0;
               contador++;
               if(contador>= frase.length){
                   contador=0;
                   
               }
           }
           for(int i=0; i<palabras.size(); i++){
                palabras.get(i).actualizar(gameover);
                gameover=palabras.get(i).actualizar(gameover);
           }
        
           repaint();
            try{
            Thread.sleep(35);
            }catch(InterruptedException e){}
            
        }while(true);
    }
    public void paint(Graphics g){
       noseve.setColor(Color.DARK_GRAY);
       noseve.fillRect(0, 0, 300, 300);
       for(int i=0; i<palabras.size(); i++)
            palabras.get(i).dibujar(noseve, i);
       if(gameover){
           noseve.setColor(Color.RED);
           noseve.drawString("GAME OVER", 120, 130);
       }
       g.drawImage(imagen, 0, 0, this);
    }
    public void update(Graphics g){
      paint(g);  
    }
     public boolean mouseDown(Event ev, int x,int y){
        /*for(int i=0; i<frase.length; i++){//+-width && +-heigth
         if((x<=palabras.get(i).x)&& (y<=palabras.get(i).y))  
            nclick++;
        }*/
        if(palabras.get(0).contains(x,y)){
            if(palabras.get(0).color == Color.PINK){
            palabras.get(0).color= Color.MAGENTA;
            }else{
            palabras.remove(0);
            }
        }
            
        /*nclick++;
        if(nclick==1){
            palabras.get(0).color=Color.MAGENTA;
        }
        if(nclick==2){
            palabras.remove(0);
            nclick=0;
        }*/
        
            
        repaint();
        return true;     
   }
}
