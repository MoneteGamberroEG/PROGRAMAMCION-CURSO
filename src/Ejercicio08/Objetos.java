package Ejercicio08;

import java.awt.*;

public class Objetos extends Frame {

    TextArea textArea;

    public static void main(String[] args) {
        Objetos app = new Objetos();
    }

    public Objetos() {
        super("Trabajando con objetos");

        setup();

        this.pack();
        resize(400, 400);
        show();
    }

    public void setup() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));
        Panel paneles[][] = new Panel[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                paneles[i][j] = new Panel();
                paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
            }
        }
        paneles[0][0].add(new Label("Campo de texto"));
        paneles[0][0].add(new MiTextField("", 15));

        textArea = new TextArea("", 5, 15);
        paneles[0][1].add(textArea);

        paneles[0][2].add(new MiBoton("Borrar", textArea));

        paneles[1][0].add(new MiCanvas());

        String choiceStrings[] = {"Sí", "No", "Quizas"};
        paneles[1][1].add(new MiChoice(choiceStrings, textArea));

        String deportes[] = {"Fútbol", "Baloncesto", "Petanca", "Badminton", "ESports", "Dardos"};
        paneles[1][2].add(new MiLista(deportes, textArea));

        String asignaturas[] = {"Programación", "Lenguaje de marcas", "Bases de Datos", "Sistemas informaticos"};

        paneles[2][0].add(new MiCheckboxes(asignaturas));

        paneles[2][1].add(new MiScrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100, textArea));
        paneles[2][2].add(new MiScrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100, textArea));

        for (int i = 0; i < paneles.length; i++) {
            for (int j = 0; j < paneles[0].length; j++) {
                principal.add(paneles[i][j]);
            }
        }
        principal.add(paneles[0][0]);
        principal.add(paneles[0][1]);
        principal.add(paneles[0][2]);
        principal.add(paneles[1][0]);
        principal.add(paneles[1][1]);
        principal.add(paneles[1][2]);
        principal.add(paneles[2][0]);

        this.add(principal);
    }

    public boolean handleEvent(Event ev) {

        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Button) {
                if ("Borrar".equals(ev.arg)) {
                    return true;
                }
            }
        }
        return false;
    }

}

class MiTextField extends TextField {

    public MiTextField(String frase, int columnas) {
        super(frase, columnas);

    }

    public boolean action(Event ev, Object arg) {
        String texto = this.getText();
        this.setText(texto.toUpperCase());
        return true;
    }

}

class MiBoton extends Button {

    TextArea tt;

    public MiBoton(String frase, TextArea texto) {
        super(frase);
        tt = texto;
    }

    public boolean action(Event ev, Object ob) {
        tt.setText(" ");
        return true;
    }

}

class MiCanvas extends Canvas {

    int posX = 20;
    int posY = 20;

    public MiCanvas() {
        super();
        resize(75, 75);
        setBackground(Color.yellow);
        setForeground(Color.red);
        show();
    }

    public void paint(Graphics g) {
        g.fillRect(posX, posY, 5, 5);
    }

    public boolean mouseDown(Event ev, int x, int y) {

        posX = x;
        posY = y;
        repaint();

        return true;
    }
}

class MiChoice extends Choice {

    public MiChoice(String elementos[], TextArea texto) {
        super();
        for (int i = 0; i < elementos.length; i++) {
            this.addItem(elementos[i]);
        }
        tt = texto;
    }

    public boolean action(Event ev, Object o) {
        tt.setText(getSelectedItem());
        return true;
    }
}

class MiLista extends List {

    TextArea tt;

    public MiLista(String deportes[], TextArea texto) {
        super(5, true);
        for (int i = 0; i < deportes.length; i++) {
            this.addItem(deportes[i]);
        }
        tt = texto;
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            tt.setText("Doble click");
            return true;
        } else if (ev.id == Event.LIST_SELECT) {
            tt.setText("Elemento Seleccionado");
            return true;
        } else if (ev.id == Event.LIST_DESELECT) {
            tt.setText("Elemento Deselccionado");
            return true;
        }
        return false;
    }
}

class MiCheckboxes extends Panel {

    Checkbox checkboxes[];
    TextField resultado;

    public MiCheckboxes(String[] elementos) {
        super();
        this.setLayout(new GridLayout(elementos.length + 1, 1));
        checkboxes = new Checkbox[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            checkboxes[i] = new Checkbox(elementos[i]);
            this.add(checkboxes[i]);
        }
        resultado = new TextField("", 15);
        this.add(resultado);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Checkbox) {

            }
        }
    }
}

class MiScrollar extends Scrollbar {

    TextArea texto;

    public MiScrollbar(int orientacion, int posicion, int anchura, int inicio, int fin) {
        super(orientacion, posicion, anchura, inicio, fin);
        texto = tt;
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.SCROLL_LINE_UP) {
            texto.setText("Posicion: " + this.getValue());
        }

    }

return false;
}
