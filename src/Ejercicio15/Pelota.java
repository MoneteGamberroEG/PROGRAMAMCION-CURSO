package Ejercicio15;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Pelota extends Bloque{
    private double velX, velY;

    public double getVelX() {
        return velX;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }
    public Pelota(){
        super(125,170,15,15,Color.orange);
        velX= -3;
        velY= -2;

    
    }
    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
   public void actualizar(Raqueta raq, List<Bloque> bloques){
       x += velX;
       y += velY;
       if((x>=285) || (x<=15))
           velX = -velX;
       if(y<=15)
           velY = -velY;
       if(this.intersects(raq))
           velY = -velY*1.1;
       for(int i = 0; i<bloques.size(); i++)
            if(bloques.get(i).intersects(this)){
                bloques.remove(i);  
                 velY = -velY;
            }
    }
}