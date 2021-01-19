
public class Java100 {

    public static void main(String arg[]) {

        //Trimestre con más nacimientos
        //mes en que más bajas se han producido (muertes + transladas)
        //en cuanto crece y decrece
        String movimientos[] = {"Nacimientos", "Defunciones", "Translados fuera", "Nuevos asentamientos"};
        int movPoblacion[][] = {{3, 2, 0, 0}, {1, 5, 0, 1}, {9, 4, 0, 0}, {3, 8, 0, 0}, {6, 1, 0, 0}, {3, 2, 1, 0}, {3, 12, 0, 1}, {2, 3, 0, 1}, {1, 7, 1, 1}, {9, 2, 0, 0}, {1, 5, 3, 0}, {5, 8, 2, 1}};
        int trimestres[] = {0, 0, 0, 0};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int crece = 0;
        int decrece = 0;

        for (int i = 0; i < movPoblacion.length; i++) {
            trimestres[i / 4] += movPoblacion[i][0];
        }
        int triMayor = 0;
        for (int i = 0; i < trimestres.length; i++) {
            if (trimestres[i] > trimestres[triMayor]) {
                triMayor = i;
            }
        }

        System.out.printf("El trimestre con más nacimientos es el %d \n", (triMayor + 1));

        //
        int posMaxD = 0;
        for (int i = 0; i < movPoblacion.length; i++) {
            if ((movPoblacion[i][1] + movPoblacion[i][2]) > (movPoblacion[posMaxD][1] + movPoblacion[posMaxD][2])) {
                posMaxD = i;
            }
        }
        System.out.printf("El mes con más bajas ha sido %s \n", meses[posMaxD]);

        //
        for (int i = 0; i < movPoblacion.length; i++) {
            crece += movPoblacion[i][0] + movPoblacion[i][3];
            decrece += movPoblacion[i][1] + movPoblacion[i][2];
        }
        if (crece > decrece) {
            System.out.printf("Ha crecido en %d habitantes", (crece - decrece));
        } else {
            System.out.printf("Ha decrecido en %d habitantes", (decrece - crece));
        }
    }
}
