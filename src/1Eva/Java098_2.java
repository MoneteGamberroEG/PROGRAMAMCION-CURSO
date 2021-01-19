
public class Java098_2 {

    public static void main(String arg[]) {

        //tenemos billetes de 500, 200, 100, 50, 20, 10, 5 y monedas de 2 y 1 euro, realizar una funcion que reciba un entero 
        //con el importe de una factura que muestre por pantalla  con que ha que pagarla teniendo en cuenta que debemos dar el 
        //menor número de monedas y billete posibles.
        int dinero[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int precio = 1678;
        int i = 0;

        while (precio > 0) {
            System.out.printf("Billetes de %d son %d \n", dinero[i], (precio / dinero[i]));
            precio %= dinero[i];
            i++;
        }
    }
}
