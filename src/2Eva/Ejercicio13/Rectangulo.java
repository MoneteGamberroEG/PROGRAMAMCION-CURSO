package Ejercicio13;

import java.awt.*;

public class Rectangulo {

    int posX, posY, anchura, altura;
    Color color;
    Image imagen;

    public Rectangulo(int px, int py, int an, int al, Color c) {
        posX = px;
        posY = py;
        anchura = an;
        altura = al;
        color = c;

    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posX, posY, anchura, altura);
    }
}
