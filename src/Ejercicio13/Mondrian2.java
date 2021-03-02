package Ejercicio13;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian2 extends Applet implements Runnable{
	public static final int ARRIBA = 0;
	public static final int ABAJO = 1;
	public static final int IZQUIERDA = 2;
	public static final int DERECHA = 3;
	int direccion;
	Thread animacion;
	Image imagen;
	Graphics noseve;
	Rectangulo rectangulos[];
	int posicionesX[] = {0, 250, 80, 80, 100, 80, 200, 0, 200};
	int posicionesY[] = {0, 0, 160, 220, 10, 100, 0, 110, 55};
	int anchuras[] = {90, 190, 100, 220, 90, 110, 45, 70, 60};
	int alturas[] = {90, 190, 120, 90, 80, 90, 45, 200, 135};
	Color colores[] = {Color.yellow, Color.yellow, Color.yellow, Color.blue, Color.blue, Color.lightGray, Color.red, Color.red, Color.magenta};
	public void init() {
		direccion = DERECHA;
		imagen = this.createImage(300, 300);
		noseve = imagen.getGraphics();
		rectangulos = new Rectangulo[9];
		for(int i = 0; i < rectangulos.length; i++){
			rectangulos[i] = new Rectangulo(posicionesX[i], posicionesY[i], anchuras[i], alturas[i], colores[i]);
		}
	}
	public void start() {
		animacion = new Thread(this);
		animacion.start();
	}
	
	public void run() {
		do {
			repaint();
			try {
				Thread.sleep(5);
			}catch(InterruptedException e) {}
		}while(true);
	}
/*	
	public void actualizar() {
		switch(direccion) {
			case ARRIBA:
				posY--;
				if(posY <= 100) {
					direccion = DERECHA;
				}
				break;
			case ABAJO:
				posY++;
				if(posY >= 120) {
					direccion = IZQUIERDA;
				}
				break;
			case DERECHA:
				posX++;
				if(posX >= 100) {
					direccion = ABAJO;
				}
				break;
			case IZQUIERDA:
				posX--;
				if(posX <= 80) {
					direccion = ARRIBA;
				}
				break;
		}
	}
	*/
	public void paint(Graphics g){
		noseve.setColor(Color.black);
		noseve.fillRect(0, 0, 300, 300);
		for(int i = 0; i < rectangulos.length; i++) {
			rectangulos[i].dibujar(noseve);
		}
		g.drawImage(imagen, 0, 0, this);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
}
