
public class Java019 {

    public static void main(String arg[]) {
        //sumar y hacer la media 

        int[] datos = {10, -20, 30, -40, 50, 60};
        int acum = 0;
        for (int i = 0; i < datos.length; i++) {
            acum += datos[i];
        }
        System.out.printf("La media de datos es %d ", (acum / datos.length));
    }
}
