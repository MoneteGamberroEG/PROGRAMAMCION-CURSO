package Ruleta;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class Ruleta extends Applet {
    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    public int rojos[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    java.util.List<Integer> lRojos;
    Casilla casillas[][];
    public int negros[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27};
    public void init(){
        lRojos = new java.util.ArrayList<Integer>();
        for(int i=0; i < rojos.length; i++)
            lRojos.add(new Integer(rojos[i]));

        casillas = new Casilla[FILAS][COLUMNAS];
        for(int i=0; i < FILAS; i++)
            for(int j=0; j < COLUMNAS; j++)
                if(lRojos.contains(new Integer((i*COLUMNAS)+j+1)))
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30, (i*Casilla.DIM)+50, (i*COLUMNAS)+j+1, Color.red);
                else
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30, (i*Casilla.DIM)+50, (i*COLUMNAS)+j+1, Color.black);
    }
    public void paint(Graphics g){
        for(int i=0; i < FILAS; i++)
            for(int j=0; j < COLUMNAS; j++)
                casillas[i][j].dibujar(g);


    }

}
