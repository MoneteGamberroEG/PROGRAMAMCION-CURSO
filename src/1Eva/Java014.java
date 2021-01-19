
public class Java014 {

    public static void main(String arg[]) {
        int datos[] = {17, 55, 33, 21, 44};
        for (int i = 0; i < 5; i++) {
            System.out.printf("datos[%d] = %d\n", i, datos[i]);
        }

        //Bucle para modificar el contenido de datos
        for (int i = 0; i < 5; i++) {
            datos[i] *= 2;
        }

        //Mostrar el contenido de los elementos del vector
        for (int i = 0; i < 5; i++) {
            System.out.printf("datos[%d] = %d\n", i, datos[i]);
        }
    }

}
