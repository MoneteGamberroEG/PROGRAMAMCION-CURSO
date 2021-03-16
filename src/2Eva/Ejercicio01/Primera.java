package Ejercicio01;

public class Primera {

    public static void main(String[] args) {
        Casa casa1, casa2;
        Casa casa3 = new Casa("Plaza del Pilar num. 1");
        Chalet chalet1;

        casa1 = new Casa("C/. Huesca, 3", 100, 5, 2);
        casa2 = new Casa("C/. Alberadon, 56", 120, 6, 3);
        chalet1 = new Chalet("Camino de los Molinos, 5", 150, 5, 2, 300, true);
        Chalet chalet2 = new Chalet("Carretera del aeropuerto, km.10", 225, false);

        casa2.setNumHab(2);

        chalet1.setPiscina();
        chalet1.mostrar();

        chalet2.setNumM(75);
        chalet2.mostrar();

        System.out.println("Direccion de casa1 " + casa1.getDireccion());
        casa3.mostrar();
    }

}
