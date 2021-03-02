/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Jugando extends Applet implements Runnable{
    public static final int NUMPELOTAS = 10;
	Thread animacion;
	Image imagen;
	Graphics noseve;
	List<Pelota2> pelotas;
	public void init() {
		imagen = this.createImage(300, 300);
		noseve = imagen.getGraphics();
                pelotas = new ArrayList<Pelota2>();
		for(int i = 0; i < NUMPELOTAS; i++){
                    pelotas.add(new Pelota2());
                }
	}
	
	public void start() {
		animacion = new Thread(this);
		animacion.start();
	}

	public void run() {
		do {
			for(int i = 0; i < pelotas.size(); i++){
                            pelotas.get(i).actualizar();
                        }
			repaint();
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {}
		}while(true);
		
	}
	public void paint (Graphics g) {
		noseve.setColor(Color.black);
		noseve.fillRect(0, 0, 300, 300);
		for(int i = 0; i < pelotas.size(); i++){
                    pelotas.get(i).dibujar(noseve);
                }
		g.drawImage(imagen, 0, 0, this);
	}
        public void update(Graphics g){
            paint(g);
        }
        public boolean mouseDown(Event ev, int x, int y){
            for(int i = 0; i < pelotas.size(); i++){
                if(pelotas.get(i).contains(x, y)){
                    pelotas.remove(i);
                }
            }
            return true;
        }
	
	

}
