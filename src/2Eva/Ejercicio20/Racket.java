package Ejercicio20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Racket extends Rectangle {

    private int puntos;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Racket(int px, int py) {
        super(px, py, 15, 60);
        puntos = 0;
    }

    public void dbujar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }

    /*public void actualizar(int t, int n){
        if(n==1){
            if(t == 1004)
                y-=2;
            if(t == 1005)
                y+=2;
        }
        if(n==2){
            if(t == 1006)
                y-=2;
            if(t == 1007)
                y+=2;
        }
        if(y<20)
            y=20;
        if(y>140)
            y=140;
    }*/
    public void actualizar(int cuanto) {
        this.y += cuanto;
        if (this.y < 20) {
            this.y = 20;
        }
        if (this.y > 140) {
            this.y = 140;
        }
    }

}
