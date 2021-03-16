
import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class Caminar extends Applet implements Runnable {
    Thread game;
    Image imagen;
    Graphics hidden;
    Animation animation;
    int counter = 0;

    public void init() {
        imagen = this.createImage(300, 300);
        hidden = imagen.getGraphics(); {};
        for (int i=0; i < animation.lenght; i++){
            animation[i] = this.getanimation(getCodeBase(), "3Eva/Sprites/Guerrillero/g" +(i+1)+ ".gif");
        }
        animation = new Animation
        resize(300, 300);
    }

    public void start() {
        game = new Thread(this);
        game.start();
    }

    public void paint(Graphics g) {
        hidden.setColor(Color.WHITE);
        hidden.fillRect(0, 0, 500, 500);
        animation.draw(hidden, this);

        g.drawImage(imagen, 0, 0, this);
    }

    public void run() {
        do {

            repaint();
            animation.update();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }while(true);

    }

    public boolean keyDown (Event ev, int keyCode) {
        if (keyCode == 118)
            animation.setVaquero(this);
        else if (keyCode == 103)
            animation.setGuerrillero(this);
        return true;
    }

    public void update(Graphics g) {
        paint(g);
    }

}