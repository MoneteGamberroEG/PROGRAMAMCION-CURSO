package Ejercicio20;

import java.awt.*;
import java.applet.Applet;

public class Pong extends Applet implements Runnable {

    Thread animacion;
    Image imagen;
    Graphics noseve;
    Racket raqueta1;
    Racket raqueta2;
    Ball bola;
    boolean g1 = false;
    boolean g2 = false;

    //int points1=0;
    //int points2=0;
    public void init() {
        imagen = this.createImage(301, 200);
        noseve = imagen.getGraphics();
        raqueta1 = new Racket(0, 50);
        raqueta2 = new Racket(286, 50);
        bola = new Ball();
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void run() {
        do {
            bola.actualizar(raqueta1, raqueta2);
            gol();
            repaint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }

        } while (true);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.LIGHT_GRAY);
        noseve.fillRect(0, 0, 301, 200);
        raqueta1.dbujar(noseve);
        raqueta2.dbujar(noseve);
        bola.dbujar(noseve);
        noseve.setColor(Color.BLACK);
        noseve.drawRect(0, 20, 300, 1);
        noseve.drawRect(150, 0, 1, 200);
        noseve.drawString("Jugador 1: " + raqueta1.getPuntos(), 20, 15);
        noseve.drawString("Jugador 2: " + raqueta2.getPuntos(), 160, 15);
        if (raqueta1.getPuntos() >= 5 || raqueta2.getPuntos() > 5) {
            noseve.setColor(Color.BLACK);
            noseve.drawString("Game Over", 120, 130);
            g.drawImage(imagen, 0, 0, this);
            animacion.stop();
            return;
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean keyDown(Event ev, int tecla) {
        switch (tecla) {
            case 119:
                //raqueta1.y -=2;
                raqueta1.actualizar(-4);
                break;
            case 115:
                //raqueta1.y +=2;
                raqueta1.actualizar(4);
                break;
            case 1004:
                //raqueta2.y -=2;
                raqueta2.actualizar(-4);
                break;
            case 1005:
                //raqueta2.y +=2;
                raqueta2.actualizar(4);
                break;
        }
        //if(raqueta1.y<20)
        //raqueta1.y=20;
        //if(raqueta1.y>140)
        //raqueta1.y=140;
        //if(raqueta2.y<20)
        //raqueta2.y=20;
        //if(raqueta2.y>140)
        //raqueta2.y=140;

        /*raqueta1.actualizar(tecla, 1);
        raqueta2.actualizar(tecla, 2);*/
        repaint();
        return true;
    }

    public void gol() {
        if (bola.x < 0) {
            //raqueta2.setPuntos(raqueta2.getPuntos()+1);
            g2 = true;
            //bola.x=raqueta1.x+25;
            //bola.y=raqueta1.y+20;
        }
        if (bola.x > 288) {
            //raqueta1.setPuntos(raqueta1.getPuntos()+1);
            g1 = true;
            //bola.x=raqueta2.x-20;
            //bola.y=raqueta2.y+20;
        }
    }

    public boolean mouseDown(Event ev, int x, int y) {
        if (g2 == true) {
            bola.x = raqueta1.x + 25;
            bola.y = raqueta1.y + 20;
            raqueta2.setPuntos(raqueta2.getPuntos() + 1);
            g2 = false;
        }
        if (g1 == true) {
            bola.x = raqueta2.x - 20;
            bola.y = raqueta2.y + 20;
            raqueta1.setPuntos(raqueta1.getPuntos() + 1);
            g1 = false;
        }
        repaint();
        return true;
    }
}
