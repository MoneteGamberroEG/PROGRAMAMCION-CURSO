/*
 * Manipula Objetos de clases de Java
 */
package Ejercicio08;

import java.awt.*;

public class Objetos extends Frame {

    TextArea textArea;

    public static void main(String[] args) {
        Objetos app = new Objetos();
    }

    public Objetos() {
        super("Trabajando con objetos de Java");
        setup();
        pack();
        resize(400, 400);
        show();
    }

    private void setup() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));
        Panel paneles[][] = new Panel[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                paneles[i][j] = new Panel();
                paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
            }
        }
        paneles[0][0].add(new Label("Campo de texto: "));
        paneles[0][0].add(new MiTextField("", 15));

        textArea = new TextArea(5, 10);
        textArea.setBackground(Color.YELLOW);
        paneles[0][1].add(textArea);

        paneles[0][2].add(new MiBoton("Limpiar", textArea));

        String opciones[] = {"Si", "No", "Quizás"};
        paneles[1][0].add(new MiChoice(opciones, textArea));

        String deportes[] = {"Atletismo", "Baloncesto", "Tenis", "Alterofília", "Esgrima", "Balonmano", "Equitación", "Patinaje"};
        paneles[1][1].add(new MiLista(deportes, textArea));

        paneles[1][2].add(new MiCanvas());

        String comidas[] = {"Patatas", "Cebollas", "Tomates", "Lechuga"};
        paneles[2][0].add(new MiCheckBoxGroup(comidas));

        paneles[2][1].add(new MiScrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100, textArea));

        paneles[2][2].add(new MiScrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100, textArea));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                principal.add(paneles[i][j]);
            }
        }
        this.add(principal);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}

class MiTextField extends TextField {

    public MiTextField(String frase, int columnas) {
        super(frase, columnas);
    }

    public boolean action(Event ev, Object ob) {
        String texto = this.getText();
        this.setText(texto.toUpperCase());
        return true;
    }
}

class MiBoton extends Button {

    TextArea texto;

    public MiBoton(String borrar, TextArea texto) {
        super(borrar);
        this.texto = texto;
    }

    public boolean action(Event ev, Object ob) {
        texto.setText(" ");
        return true;
    }
}

class MiChoice extends Choice {

    TextArea texto;

    public MiChoice(String[] opciones, TextArea texto) {
        super();
        for (int i = 0; i < opciones.length; i++) {
            this.add(opciones[i]);
        }
        this.texto = texto;
    }

    public boolean action(Event ev, Object ob) {
        this.texto.setText(this.getSelectedItem());
        return true;
    }
}

class MiLista extends List {

    TextArea texto;

    public MiLista(String[] deportes, TextArea texto) {
        super(5, true);
        for (int i = 0; i < deportes.length; i++) {
            this.add(deportes[i]);
        }
        this.texto = texto;
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            this.texto.setText("Doble click");
            return true;
        } else if (ev.id == Event.LIST_SELECT) {
            this.texto.setText("Selecciono un item");
            return true;
        } else if (ev.id == Event.LIST_DESELECT) {
            this.texto.setText("Deseleccionó un item");
            return true;
        }
        return false;
    }
}

class MiCanvas extends Canvas {

    int posx = 20;
    int posy = 20;

    public MiCanvas() {
        super();
        this.resize(75, 75);
        this.setBackground(Color.YELLOW);
        this.setForeground(Color.RED);
        this.show();
    }

    public void paint(Graphics g) {
        g.fillRect(posx, posy, 5, 5);
    }

    public boolean mouseDown(Event ev, int x, int y) {
        posx = x;
        posy = y;
        repaint();
        return true;
    }
}

class MiCheckBoxGroup extends Panel {

    Checkbox checkBoxes[];
    TextField resultado;

    public MiCheckBoxGroup(String[] elementos) {
        super();
        this.setLayout(new GridLayout(elementos.length + 1, 1));
        checkBoxes = new Checkbox[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            checkBoxes[i] = new Checkbox(elementos[i]);
            this.add(checkBoxes[i]);
        }
        resultado = new TextField("", 15);
        this.add(resultado);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Checkbox) {
                String mostrar = "";
                for (int i = 0; i < checkBoxes.length; i++) {
                    if (checkBoxes[i].getState()) {
                        mostrar += checkBoxes[i].getLabel() + " ";
                    }
                }
                resultado.setText(mostrar);
                return true;
            }
        }
        return false;
    }
}

class MiScrollbar extends Scrollbar {

    TextArea text;

    public MiScrollbar(int orientacion, int position, int width, int start, int end, TextArea text) {
        super(orientacion, position, width, start, end);
        this.text = text;
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.SCROLL_LINE_UP) {
            text.setText("Posición: " + this.getValue());
        } else if (ev.id == Event.SCROLL_LINE_DOWN) {
            text.setText("Posición: " + this.getValue());
        } else if (ev.id == Event.SCROLL_PAGE_UP) {
            text.setText("Posición: " + this.getValue());
        } else if (ev.id == Event.SCROLL_PAGE_DOWN) {
            text.setText("Posición: " + this.getValue());
        } else if (ev.id == Event.SCROLL_ABSOLUTE) {
            text.setText("Posición: " + this.getValue());
        }
        return false;
    }
}
