package Ruleta;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Daniel
 */
public class Casilla extends Rectangle{
    public static final int DIM = 60;
    int valor; 
    Color color;
    public Casilla(int posx, int posy, int v, Color c){
        super(posx, posy, DIM, DIM);
        valor = v;
        color = c;

    }
    public void dibujar(Graphics g){
        g.setColor(black);
        g.drawRect(x, y, width,height);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.setColor(color);
        g.drawString(""+valor, x+20, y+40);
    }
}
