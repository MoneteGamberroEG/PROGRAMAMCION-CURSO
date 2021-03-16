package Ejercicio11;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Event;
import java.util.List;
import java.util.ArrayList;

public class MiCanvas extends Canvas {

    private List<DosPuntos> lista;

    public List<DosPuntos> getLista() {
        return lista;
    }

    public void setLista(List<DosPuntos> lista) {
        this.lista = lista;
    }
    DosPuntos actual;
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public MiCanvas() {
        super();
        lista = new ArrayList<DosPuntos>();
    }

    public void paint(Graphics g) {
        if (actual != null) {
            actual.dibujar(g);
        }
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).dibujar(g);
        }
    }

    public boolean mouseDown(Event ev, int x, int y) {
        actual = new DosPuntos(x, y, tipo);
        return true;
    }

    public boolean mouseDrag(Event ev, int x, int y) {
        actual.setFinX(x);
        actual.setFinY(y);
        repaint();
        return true;
    }

    public boolean mouseUp(Event ev, int x, int y) {
        lista.add(actual);
        actual = null;
        return true;
    }
}
