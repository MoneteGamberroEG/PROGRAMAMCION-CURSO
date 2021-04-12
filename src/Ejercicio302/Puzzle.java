package Ejercicio302;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Puzzle extends Applet{ 
    public static final int PIEZAS = 25;
    public static final int FILAS = 5;
    Image[] imagenes;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pieza[] piezas;
    Pieza actual;
    Rectangle huecos[][];
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        piezas = new Pieza[PIEZAS];
        imagenes = new Image[PIEZAS];
        for(int i=0; i<PIEZAS; i++){
            imagenes[i] = getImage(getCodeBase(), "./Ejercicio302/directorioImagenes/" + (i+1)+ ".png");
            piezas[i] = new Pieza(imagenes[i], i);
        }
        huecos = new Rectangle[FILAS][FILAS];
         for(int i=0; i < FILAS; i++)
            for(int j=0; j < FILAS; j++)
                huecos[i][j] = new Rectangle((j * Pieza.DIMENSION) + 50, (i * Pieza.DIMENSION));
    }


     public void paint(Graphics g){
         noseve.setColor(Color.white);
         noseve.fillRect(0, 0, 700, 500);
         noseve.setColor(Color.orange);
         for(int i=0; i < FILAS; i++)
            for(int j=0; j < FILAS; j++)
                noseve.drawRect(huecos[i][j].x, huecos[i][j].y, Pieza.DIMENSION, Pieza.DIMENSION);
         for(int i=0; i < PIEZAS; i++){
             piezas[i].dibujar(noseve, this);
         }
         g.drawImage(imagen, 0, 0, this);
         
     }
    public void update(Graphics g){
      paint(g);  
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        for(int i=0; i < PIEZAS; i++)
            if((piezas[i].contains(x, y)) && !piezas[i].isColocado())
                actual = piezas[i]; 
        return true;
        
    }
    public boolean mouseUp(Event ev, int x, int y){
        if(actual != null)
         for(int i=0; i < FILAS; i++)
            for(int j=0; j < FILAS; j++)
                if(huecos[i][j].intersects(actual))
                    if(actual.posicion == (i*FILAS)+j)
                        actual.moverJusto(huecos[i][j].x, huecos[i][j].y);
                        actual.setColocado(true);
                        repaint();
                
        actual = null;
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y){
        if(actual != null){
        actual.mover(x, y);
        repaint();
        return true;
        }
        return false;
    }
}
