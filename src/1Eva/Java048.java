
public class Java048 {

    public static void main(String arg[]) {

        //debe devolver un vector con cuatro elementos con lo que ha cobrado cada empleado en los seis meses
        //sumar cuanto se paga cada mes en total
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier", "Alejandro", "Eduardo", "Daniel", "Pedro"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", " "};

        int emplAcum[] = salariosSemestrales(salarios);
        for (int i = 0; i < emplAcum.length; i++) {
            System.out.printf("%s ha cobrado %d\n", empleados[i], emplAcum[i]);
        }

        int empleadosAcum[] = {0, 0, 0, 0};
        salariosSemestrales2(salarios, empleadosAcum);

        int mesesAcum[] = sumaSalarios(salarios);
        for (int i = 0; i < mesesAcum.length; i++) {
            System.out.printf("En el mes de %s, se ha pagado %d\n", meses[i], mesesAcum[i]);
        }

        int mesAcum[] = new int[6];
        sumaSalarios2(salarios, mesAcum);
        for (int i = 0; i < mesAcum.length; i++) {
            System.out.printf("En el mes de %s, se ha pagado %d\n", meses[i], mesAcum[i]);
        }
    }

    public static void sumaSalarios2(int[][] sal, int[] vAcum) {
        for (int j = 0; j < vAcum.length; j++) {
            vAcum[j] = 0;
            for (int i = 0; i < sal.length; i++) {
                vAcum[j] += sal[i][j];
            }
        }
    }

    public static int[] sumaSalarios(int sal[][]) {
        int suma[] = {0, 0, 0, 0, 0, 0};
        for (int j = 0; j < suma.length; j++) {
            for (int i = 0; i < sal.length; i++) {
                suma[j] += sal[i][j];
            }
        }
        return suma;
    }

    public static int[] salariosSemestrales(int[][] sal) {
        int vAcum[] = new int[4];
        for (int i = 0; i < sal.length; i++) {
            vAcum[i] = 0;
            for (int j = 0; j < sal[i].length; j++) {
                vAcum[i] += sal[i][j];
            }

        }
        return vAcum;
    }

    public static void salariosSemestrales2(int[][] sal, int[] vAcum) {
        for (int i = 0; i < sal.length; i++) {
            for (int j = 0; j < sal[i].length; j++) {
                vAcum[i] += sal[i][j];
            }
        }
    }
}
