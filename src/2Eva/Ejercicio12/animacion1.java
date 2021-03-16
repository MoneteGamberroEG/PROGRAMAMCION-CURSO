package ejercicio12;

import java.awt.*;

public class animacion1 extends Frame implements Runnable {

    Thread animacion;
    String frames[] = {"*", "**", "***", "****", "*****", "****", "***", "**", "*"};
    int actual = 0;

    public static void main(String[] args) {
        animacion1 app = new animacion1();
    }

    public animacion1() {
        super("Animacion sencilla");
        this.pack();
        resize(200, 200);
        show();
        animacion = new Thread(this);
        animacion.start(); //desde aqui llamamos al metodo run
    }

    public void run() {
        do {
            actual = (actual + 1) % frames.length;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        } while (true);
    }

    public void paint(Graphics g) {
        g.drawString(frames[actual], 100, 100);
    }

    public boolean handleEvent(Event evt) {
        if (evt.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}
