package Ejercicio03;

public class Nif {

    public int dni;
    public char letra;
    public static char tabla[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Nif(int dni, char letra) throws NifException {
        this.dni = dni;
        if (letra != tabla[dni % 23]) {
            throw new NifException("La letra no es correcta");
        }
        this.letra = tabla[dni % 23];
    }

    public Nif(int dni) {
        this.dni = dni;
        letra = tabla[dni % tabla.length];
    }

    public void escribir() {
        System.out.printf("%d - %c\n", dni, letra);
    }
}
