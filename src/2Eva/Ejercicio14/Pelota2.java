/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

public class Pelota2 extends Rectangle {

    Color colores[] = {Color.red, Color.yellow, Color.magenta, Color.magenta, Color.GREEN};
    int velX, velY;
    Color color;

    public Pelota2() {
        super((int) (Math.random() * 250), (int) (Math.random() * 250), 0, 0);
        int diametro = (int) (Math.random() * 15) + 10;
        width = height = diametro;
        color = colores[(int) (Math.random() * 5)];
        velX = (int) (Math.random() * 5) + 1;
        velY = (int) (Math.random() * 5) + 1;
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    public void actualizar() {
        x += velX;
        y += velY;
        if ((x >= 275) || (x <= 0)) {
            velX = -velX;
        }
        if ((y >= 275) || (y <= 0)) {
            velY = -velY;
        }
    }
}
