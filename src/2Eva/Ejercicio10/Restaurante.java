package Ejercicio10;

import java.awt.*;

public class Restaurante extends Frame {

    String[] comidas = {"Desayuno", "Almuerzo", "Cena"};
    String[][] platos = {{"Leche", "Cafe", "Huevos", "Tostadas", "Cereales", "Mermelada", "Bacón"},
    {"Paella", "Sopa", "Macarrones", "Filete", "Pescado", "Albondigas", "Hamburguesa"},
    {"Tortilla", "Sopa", "Hamburguesa", "Ensalada", "Pollo", "Bocadillo", "Sandwich"}};

    Choice chComidas;
    List platosComida;
    List[] listaPlatos;
    TextField texto;

    public static void main(String args[]) {
        Restaurante app = new Restaurante();
    }

    public Restaurante() {
        super("Restaurante Chicote");

        setup();

        this.pack();
        resize(275, 175);
        show();
    }

    public void setup() {
        this.add("North", new Label("Elige tu comanda: "));
        chComidas = new Choice();
        for (int i = 0; i < comidas.length; i++) {
            chComidas.addItem(comidas[i]);
        }
        this.add("West", chComidas);
        listaPlatos = new List[comidas.length];
        for (int i = 0; i < platos.length; i++) {
            listaPlatos[i] = new List(6, true);
            for (int j = 0; j < platos[i].length; j++) {
                listaPlatos[i].addItem(platos[i][j]);
            }
        }
        platosComida = listaPlatos[0];
        this.add("East", platosComida);
        texto = new TextField("", 40);
        this.add("South", texto);
    }

    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        } else if (ev.id == Event.ACTION_EVENT) {
            if (ev.target instanceof Choice) {
                this.remove(platosComida);
                platosComida = listaPlatos[chComidas.getSelectedIndex()];
                this.add("East", platosComida);
                this.show();
                return true;
            }
        } else if ((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {
            String peticion = chComidas.getSelectedItem() + " : ";
            String[] seleccionados = platosComida.getSelectedItems();
            for (int i = 0; i < seleccionados.length; i++) {
                peticion += seleccionados[i] + " ";
            }
            texto.setText(" ");
            return true;
        }
        return false;
    }
}
