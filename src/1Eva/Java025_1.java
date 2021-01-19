
public class Java025_1 {

    public static void main(String arg[]) {

        //Sacar todas las tablas de multiplicar del 1 al 9 usando un bucle
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabla del " + i + " : ");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, (j + 1), i * (j + 1));
            }

        }
    }
}
