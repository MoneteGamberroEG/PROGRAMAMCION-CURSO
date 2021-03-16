package Ejercicio19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Frog extends Rectangle {

    public Frog() {
        super(150, 150, 25, 20);
    }

    public void dbujar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(x, y, width, height);
    }

    public void actualizar(int t) {
        switch (t) {
            case 1004:
                y--;
                break;
            case 1005:
                y++;
                break;
            case 1006:
                x--;
                break;
            case 1007:
                x++;
                break;
        }
        /*if(t == 1006)
            x--;
        if(t == 1007)
            x++;
        if(t == 1004)
            y--;
        if(t == 1005)
            y++;*/
        //Mejor con el switch
    }
}
