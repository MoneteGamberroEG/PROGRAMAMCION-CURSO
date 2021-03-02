/*
 Dibujaremos lineas, �valos o rectangulos
 */
package Ejercicio11;

import java.awt.*;
import java.util.*;

public class DibujarApp extends Frame {

    MiCanvas canvas;

    public static void main(String[] args) {
        DibujarApp app = new DibujarApp();
    }

    public DibujarApp() {
        super("Dibujando en el Frame");
        setup();
        pack();
        resize(400, 400);
        show();
    }

    public void setup() {
        setupMenuBar();
        canvas = new MiCanvas();
        this.add("Center", canvas);

    }

    public void setupMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menuBar.add(menu1);
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Linea"));
        menu2.add(new MenuItem("Ovalo"));
        menu2.add(new MenuItem("Rectangulo"));
        menuBar.add(menu2);
        this.setMenuBar(menuBar);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof MenuItem) {
                if (ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                } else if (ev.arg.equals("Linea")) {
                    canvas.setTipo(0);
                    return true;
                } else if (ev.arg.equals("Ovalo")) {
                    canvas.setTipo(1);
                    return true;
                } else if (ev.arg.equals("Rectangulo")) {
                    canvas.setTipo(2);
                    return true;
                } else if (ev.arg.equals("Nuevo")) {
                    canvas.getLista().clear();
                    canvas.repaint();
                    return true;
                }
            }
        }
        return false;
    }

}
