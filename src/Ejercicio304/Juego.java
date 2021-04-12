
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;

public class Juego extends Applet {

    public static final int LENGTH = 5;
    Image imagen;
    Graphics hidden;
    Image imagenes[][];
    Slot slots[][];
    AudioClip error, correct, exito; //para añadir sonidos.
    Button boton;
    Point blank;

    public void init() {
        imagen = this.createImage(400, 400);
        hidden = imagen.getGraphics();
        imagenes = new Image[LENGTH][LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                imagenes[i][j] = getImage(getCodeBase(), "Ejercicio304/botones/" + ((i * LENGTH) + j + 1) + ".gif");
            }
        }

        slots = new Slot[LENGTH][LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                slots[i][j] = new Slot(imagenes[i][j], ((i * LENGTH) + j + 1)); //la i vale 5 veces más que la j, y nos indicará el índice del hueco.
            }
        }
        try {
            error = getAudioClip(new URL(getCodeBase(), "Ejercicio304/sonidos/error.wav"));
            correct = getAudioClip(new URL(getCodeBase(), "Ejercicio304/sonidos/correct.wav"));
            exito = getAudioClip(new URL(getCodeBase(), "Ejercicio304/sonidos/exito.wav"));
        } catch (MalformedURLException e) {
        }

        boton = new Button("Press");
        this.setLayout(new BorderLayout());
        this.add("South", boton);

        blank = new Point(LENGTH - 1, LENGTH - 1);
    }

    public void paint(Graphics g) {
        hidden.setColor(Color.lightGray);
        hidden.fillRect(0, 0, 400, 400);
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                slots[i][j].paint(hidden, this, j, i);
            }
        }

        g.drawImage(imagen, 0, 0, this);
        resize(400, 400);
    }

    public boolean move(Point click) {
        Point shift, till;	//'shift' es el desplazamiento, 'till' es hasta donde llega el desplazamiento.

        shift = new Point(delta(click.x, blank.x), delta(click.y, blank.y));
        if ((shift.x == 0) && (shift.y == 0)) {
            return false;
        }
        if ((shift.x != 0) && (shift.y != 0)) {
            return false;
        }

        till = new Point(click.x + shift.x, click.y + shift.y);
        if (!((till.x == blank.x) && (till.y == blank.y))) //recursividad.
        {
            move(till);
        }
        slots[blank.x][blank.y].setImagen(slots[click.x][click.y].getImagen());
        slots[blank.x][blank.y].index = slots[click.x][click.y].index;
        slots[click.x][click.y].setImagen(null);
        slots[click.x][click.y].index = 24;
        blank = click;

        return true;
    }

    //esta función hace referencia al deplazamiento ya sea
    public int delta(int a, int b) {	//hacia arriba, abajo, derecha, izquierda o no moverse,
        //en función del valor que devuelva(-1, 0, 1)

        if (a == b) {
            return 0;
        } else {
            return ((b - a) / Math.abs(b - a));	//así nos devolverá -1 o 1, en función de si 'b' es mayor o menor que 'a'.
        }
    }

    public boolean mouseDown(Event ev, int x, int y) {
        Point click;
        click = new Point(y / Slot.DIMENSION, x / Slot.DIMENSION); 	//están del revés porque la 'x' me sirve para las columnas,
        //mientras que la 'y' me sirve para las filas.
        //por tanto x = y/Slot.DIMENSION e y = x/Slot.DIMENSION.
        if (move(click)) {
            correct.play();
            repaint();
        } else {
            error.play();
        }

        return true;
    }

    public boolean action(Event ev, Object ob) {
        if (ev.target instanceof Button) {
            for (int i = 0; i < 200; i++) {
                move(new Point((int) (Math.random() * 5), (int) (Math.random() * 5)));
            }
            repaint();

        }
        return false;
    }

}
