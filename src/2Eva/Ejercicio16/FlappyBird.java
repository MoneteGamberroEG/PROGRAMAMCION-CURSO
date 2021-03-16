package Ejercicio16;

import java.awt.*;
import java.applet.Applet;
import java.util.List;
import java.util.ArrayList;

public class FlappyBird extends Applet implements Runnable {

    public static final int POSI = 300;
    public static final int TIEMPO = 30;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Bird pajaro;
    List<Column> columnas;
    int segundos = 0;
    boolean gameover = false;

    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        pajaro = new Bird();
        columnas = new ArrayList<Column>();
        columnas.add(new Column(POSI));
    }

    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }

    public void run() {
        do {
            if (segundos >= 3000) {
                columnas.add(new Column(POSI));
                segundos = 0;
            }
            pajaro.actualizar(columnas, this);
            for (int i = 0; i < columnas.size(); i++) {
                columnas.get(i).mover();
            }
            if (columnas.get(0).getRectangle1().x <= -Column.ANCHURA) {
                columnas.remove(0);
            }
            /*if((pajaro.intersects(columnas.get(0).getRectangle1())) || (pajaro.intersects(columnas.get(0).getRectangle2()))){
               gameover = true;
               repaint();
               animacion.stop();
           } */
            repaint();
            segundos += TIEMPO;
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {
            }

        } while (true);
    }

    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY);
        noseve.fillRect(0, 0, 300, 300);
        pajaro.dibujar(noseve);
        for (int i = 0; i < columnas.size(); i++) {
            columnas.get(i).dibujar(noseve);
        }
        if (gameover) {
            noseve.setColor(Color.RED);
            noseve.drawString("GAME OVER", 120, 130);
        }
        g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean mouseDown(Event ev, int x, int y) {
        pajaro.y += -15;
        repaint();
        return true;
    }
}
