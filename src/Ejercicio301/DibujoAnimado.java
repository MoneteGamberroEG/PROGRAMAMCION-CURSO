/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio301;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Daniel
 */
public class DibujoAnimado {
    private Image[] imagenes;
    int actual;
    int x;
    
    public DibujoAnimado(Image[] imgs, int posx){
        imagenes = imgs;
        actual =0;
        x = posx;
    }
    
    public void paint (Graphics g, Applet ap){
        g.drawImage(imagenes[0], 100, 10, 50, 100, ap);
        
    }
    public void actualizar(){
        actual = (actual + 1) % 4;
    }
    public void setImagenes(Image[] imagenes) {
        this.imagenes = imagenes;
    }
    
}
