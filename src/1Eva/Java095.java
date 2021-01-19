
public class Java095 {

    public static void main(String arg[]) {

        //Decir cuantas u, d, c, um, dm, cm hay en el numero
        String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
        int numero = 356432;

        while (numero != 0) {
            System.out.println(" " + (numero % 10));
            numero /= 10;
        }

        System.out.println("El bucle ha terminado");
    }
}
