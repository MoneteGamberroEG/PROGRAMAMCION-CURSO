package Ejercicio303;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

public class Flecha {
    public static final int ANCHURA = 70;
    public static final int ALTURA = 20;
    public static final int VELOCIDAD = 8;
    private int x, y;
    Image imagen;
    public Flecha(Image img, int y){
        imagen = img;
        this.x = 90;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void dibujar(Graphics g, Applet ap){
        g.drawImage(imagen, x, y, ANCHURA, ALTURA, ap);
    }
    public void actualizar(){
        x += VELOCIDAD;
    }
    public Point punta(){
        return new Point(x+ANCHURA, y+(ALTURA/2));
    }
    
}
