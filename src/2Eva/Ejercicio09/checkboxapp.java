/*
 * Objetos de la clase Checkbox
 */
package Ejercicio09;

import java.awt.*;

public class checkboxapp extends Frame {

    CheckBoxPanel ch1;
    CheckBoxPanelGroup ch2;

    public static void main(String[] args) {
        checkboxapp app = new checkboxapp();
    }

    public checkboxapp() {
        super("Checkbox Aplicación");
        setup();
        pack();
        resize(300, 300);
        show();
    }

    private void setup() {
        this.setLayout(new GridLayout(1, 2));
        String deportes[] = {"Atletismo", "Baloncesto", "Tenis", "Alterofília", "Esgrima", "Balonmano", "Equitación", "Patinaje"};
        String edades[] = {"Menos de 20", "De 20 a 39", "De 40 a 59", "De 60 a 79", "80 o más"};
        ch1 = new CheckBoxPanel(deportes, "¿Qué deportes de gustan?");
        ch2 = new CheckBoxPanelGroup(edades, "¿Qué edad tiene?");
        this.add(ch1);
        this.add(ch2);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }
}

class CheckBoxPanel extends Panel {

    Checkbox checkBoxes[];

    public CheckBoxPanel(String[] opciones, String pregunta) {
        super();
        this.setLayout(new GridLayout(opciones.length + 1, 1));
        this.add(new Label(pregunta));
        checkBoxes = new Checkbox[opciones.length];
        for (int i = 0; i < opciones.length; i++) {
            checkBoxes[i] = new Checkbox(opciones[i]);
            this.add(checkBoxes[i]);
        }
    }
}

class CheckBoxPanelGroup extends CheckBoxPanel {

    public CheckBoxPanelGroup(String[] opciones, String pregunta) {
        super(opciones, pregunta);
        CheckboxGroup grupo = new CheckboxGroup();
        for (int i = 0; i < checkBoxes.length; i++) {
            checkBoxes[i].setCheckboxGroup(grupo);
        }
    }
}
