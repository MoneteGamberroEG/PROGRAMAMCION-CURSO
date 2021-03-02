/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota {
    Color colores[] = {Color.red, Color.yellow, Color.magenta, Color.magenta, Color.GREEN};
	int posX, posY, anchura, altura;
	int velX, velY; 
	Color color;
	public Pelota() {
		posX = 50;
		posY = 50;
		anchura = altura =(int)(Math.random()*15) + 10;
		color = colores[(int)(Math.random()*5)];
		velX = (int)(Math.random()*5) + 1;
		velY = (int)(Math.random()*5) + 1;
	}
	
	public void dibujar(Graphics g) {
		g.setColor(color);
		g.fillOval(posX, posY, anchura, altura);
	}
	
	public void actualizar() {
		posX += velX;
		posY += velY;
		if((posX >= 275) || (posX <= 0)) {
			velX = -velX;
		}
		if((posY >= 275) || (posY <= 0)) {
			velY = -velY;
		}
	}
}
