package Ejercicio01;

public class Chalet extends Casa {

    int metrosJardin;
    boolean piscina;

    public Chalet(String dir, int nm, int nh, int nb, int mj, boolean piscina) {
        super(dir, nm, nh, nb);
        this.metrosJardin = mj;
        this.piscina = piscina;
    }

    public Chalet(String dir, int mj, boolean pis) {
        super(dir);
        this.metrosJardin = mj;
        this.piscina = pis;
    }

    public int getMetros() {
        return metrosJardin;
    }

    public void setMetros(int nm) {
        metrosJardin = nm;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina() {
        piscina = !piscina;
    }

    public void mostrar() {
        System.out.printf("Chalet situado en %s con %d metros, %d habitacionesy %d ba�os. ", getDireccion(), this.getNumM(), this.getNumHab(), this.getBanyos());
        if (isPiscina()) {
            System.out.printf("Con piscina y %d metros de jardin\n", metrosJardin);
        } else {
            System.out.printf("Con %d metros de jardin, pero sin piscina\n", metrosJardin);
        }
    }
}
