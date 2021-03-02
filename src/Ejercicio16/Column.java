package Ejercicio16;
import java.awt.*;
public class Column {
    public static final int HUECO = 50;
    public static final int ANCHURA = 30;
    public static final int VELX = -1;
    Color color;
    private Rectangle rectangle1;
    private Rectangle rectangle2;

    public Rectangle getRectangle1() {
        return rectangle1;
    }

    public void setRectangle1(Rectangle rectangle1) {
        this.rectangle1 = rectangle1;
    }

    public Rectangle getRectangle2() {
        return rectangle2;
    }

    public void setRectangle2(Rectangle rectangle2) {
        this.rectangle2 = rectangle2;
    }
    public Column (int posx){
        color = Color.ORANGE;
        int altura = (int)(Math.random()*150)+HUECO;
        rectangle1= new Rectangle(posx,0, ANCHURA, altura);
        rectangle2= new Rectangle(posx, altura + HUECO, ANCHURA, 300-(altura + HUECO));
        
    }
     public void dibujar(Graphics g){
        g.setColor(color);
        g.fillRect(rectangle1.x, rectangle1.y, rectangle1.width, rectangle1.height);
        g.fillRect(rectangle2.x, rectangle2.y, rectangle2.width, rectangle2.height);
    }
    public void mover(){
       rectangle1.x += VELX;
       rectangle2.x += VELX;
       
    }
    
}
