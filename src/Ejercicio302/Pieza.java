package Ejercicio302;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Pieza extends Rectangle{
    public static final int DIMENSION = 60;
    Image imagen;
    int posicion;
    private boolean colocado;
    
    public Pieza(Image img, int pos){
        super((int)(Math.random()*240) + 400, (int)(Math.random()*440), DIMENSION, DIMENSION);
        imagen = img;
        posicion = pos;
        colocado = false;
    }
    
    public void dibujar(Graphics g, Applet app){
        g.drawImage(imagen, x, y, app);
        
    }
    public void mover(int posX, int posY){
        x = posX - (DIMENSION/2);
        y = posY - (DIMENSION/2);
    }
    public void moverJusto(int posx, int posy){
        x = posx;
        y = posy;
        
    }

    public boolean isColocado() {
        return colocado;
    }

    public void setColocado(boolean colocado) {
        this.colocado = colocado;
    }
    
    
}
