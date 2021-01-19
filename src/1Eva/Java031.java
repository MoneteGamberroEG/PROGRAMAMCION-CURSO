
public class Java031 {

    //Cuantos euros has ganado segun las ventas y el precio de los productos
    public static void main(String arg[]) {
        int ventas[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        String productos[] = {"Naranjas", "Peras", "Melones"};
        double precios[] = {1.5, 2, 0.8};
        double acum, total = 0;
        for (int i = 0; i < productos.length; i++) {
            acum = 0;
            for (int k = 0; k < ventas[i].length; k++) {
                acum += ventas[i][k] * precios[i];
            }
            total += acum;
            System.out.printf("Vendidos %.2f euros de %s \n", acum, productos[i]);
        }
    }
}
