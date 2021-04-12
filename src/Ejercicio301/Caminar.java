/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio301;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Caminar extends Applet implements Runnable{
    Image[][] dibujos;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    DibujoAnimado dibujo;
    String elementos[] = {"Guerrillero/g", "Hampon/H", "Vaquero/v"};
    ArrayList<DibujoAnimado> animados;
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        dibujos = new Image[3][4];
        for(int i=0; i<3; i++)
            for(int j=1; j<5; j++)
             dibujos[i][j-1] = this.getImage(getCodeBase(), "./Ejercicio301/Sprites/" + elementos[i] + j + ".gif");
        animados = new ArrayList<DibujoAnimado>();
       for(int i=0; i<10; i++)
           animados.add(new DibujoAnimado(dibujos[0], 50*i));
    }
     public void start(){
        animacion= new Thread(this);
        animacion.start();
    }
     public void run(){
        do{
            for(int i=0; i<10; i++)

           repaint();
            try{
                Thread.sleep(30);
            }catch(InterruptedException e){}
            
        }while(true);
        
     }
     public void paint(Graphics g){
         noseve.setColor(Color.white);
         noseve.fillRect(0, 0, 300, 300);
         for(int i=0; i<10; i++)
         dibujo.paint(noseve, this); 
         g.drawImage(imagen, 0, 0, this);
         
     }
    public void update(Graphics g){
      paint(g);  
    }
    public boolean keyDown(Event ev, int tecla){
        switch(tecla){
            case 103:
            case 71:
                for(int i=0; i<10; i++) 
                    dibujo.setImagenes(dibujos[0]);
                break;
            case 104:
            case 72:
                dibujo.setImagenes(dibujos[1]);
                break;
            case 118:
            case 73:
                dibujo.setImagenes(dibujos[2]);
                break;
            case 119:
            case 74:
                dibujo.setImagenes(dibujos[3]);
                break;      
        }
        return true;
    }
}
