
public class Java052 {

    public static void main(String arg[]) {

        //crear una función de suma que espera recibir un vector unidensional y te devuelve la suma de ese vector
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier", "Alejandro", "Eduardo", "Daniel", "Pedro"};

        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %s ha conseguido %d\n", empleados[i], suma(salarios[i]));
        }
    }

    public static int suma(int v[]) {
        int acum = 0;
        for (int i = 0; i < v.length; i++) {
            acum += v[i];
        }
        return acum;
    }
}
