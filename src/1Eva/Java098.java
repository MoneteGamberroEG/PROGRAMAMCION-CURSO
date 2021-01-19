
public class Java098 {

    public static void main(String arg[]) {

        //tenemos billetes de 500, 200, 100, 50, 20, 10, 5 y monedas de 2 y 1 euro, realizar una funcion que reciba un entero 
        //con el importe de una factura que muestre por pantalla  con que ha que pagarla teniendo en cuenta que debemos dar el 
        //menor número de monedas y billete posibles.
        int dinero[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int precio = 1678;
        int cantidad[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < dinero.length; i++) {
            if (dinero[i] <= precio) {
                cantidad[i] += 1;
                precio -= dinero[i];
                i = -1;
            }
        }
        for (int j = 0; j < dinero.length; j++) {
            System.out.println("Hay " + cantidad[j] + " de " + dinero[j]);
        }
    }
}
