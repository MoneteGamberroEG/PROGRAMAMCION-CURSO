package EXAMEN2ºEv;


import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicioexamen extends Applet implements Runnable {

    public static final int SIZE = 500;

    Thread game;
    Image image;
    Graphics hidden;
    List<Bloques> bloques = new ArrayList<Bloques>();
    List<Granizo> granizo = new ArrayList<Granizo>();
    int newBloqueCounter = 60;
    int newgranizoCounter = 0;
    boolean gameover = false;
    jugador player = new jugador(20, SIZE / 2, 30, 29);

    /**
     *
     */
    @Override
    public void init() {
        this.resize(SIZE, SIZE);
        for (int i = 0; i < 8; i++) {
            addNewBloque(SIZE + i * 40);
        }
    }

    private void addNewBloque(int size) {
        bloques.add(new Bloques(size, 25 * new Random().nextInt(SIZE / 25), 30));
    }

    public void start() {
        game = new Thread(this);
        game.start();
        image = this.createImage(SIZE, SIZE);
        hidden = image.getGraphics();
    }

    public void stop() {

    }

    public void run() {
        while (true) {

            for (int i = 0; i < bloques.size(); i++) {
                Bloques.get(i).update();
            }

            for (int i = 0; i < granizo.size(); i++) {
                if (granizo.get(i).update(player)) {
                    gameover = true;
                }
            }

            newBloqueCounter--;
            if (newBloqueCounter <= 0) {
                addNewBloque(SIZE);
                newBloqueCounter = 60;
            }

            newgranizoCounter--;
            if (newgranizoCounter <= 0) {
                granizo.add(new Granizo());
                newgranizoCounter = new Random().nextInt(40) + 30;
            }

            if (player.update(bloques)) {
                gameover = true;
            };

            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        if (gameover) {
            hidden.setColor(Color.black);
            hidden.fillRect(0, 0, SIZE, SIZE);
            hidden.setColor(Color.red);
            hidden.drawString("you loseee!!!", SIZE / 2, SIZE / 2);
            g.drawImage(image, 0, 0, this);
            game.stop();
            return;
        }
        hidden.setColor(Color.black);
        hidden.fillRect(0, 0, SIZE, SIZE);
        for (int i = 0; i < bloques.size(); i++) {
            Bloques.get(i).draw(hidden);
        }
        for (int i = 0; i < granizo.size(); i++) {
            granizo.get(i).draw(hidden);
        }
        player.draw(hidden);

        g.drawImage(image, 0, 0, this);
    }
    
    @Override
    public boolean keyDown(Event event, int keyCode) {
        if (keyCode == 1007) {
            player.moveRight();
        } else if (keyCode == 1006) {
            player.moveLeft();
        } else if (keyCode == 1004) {
            player.jump();
        }
        return true;
    }

}
