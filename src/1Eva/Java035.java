
public class Java035 {

    public static void main(String arg[]) {

        //el alumno con mejores y peores notas y su media
        //la asignatura con mejor y peor nota y su media
        int notas[][] = {{7, 9, 3, 8}, {10, 9, 9, 8}, {9, 5, 6, 10}, {8, 5, 4, 5}, {3, 10, 5, 6}};
        String alumnos[] = {"Javier", "Alejandro", "Eduardo", "Daniel", "Pedro"};
        String asignaturas[] = {"Programacion", "Sistemas", "Marcas", "Bases de datos"};
        double vAlumnosNota[] = {0, 0, 0, 0, 0};
        double vAsigNota[] = {0, 0, 0, 0};
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                vAlumnosNota[i] += notas[i][j];
            }
        }

        int posMejorAl = 0;
        int posPeorAl = 0;
        for (int i = 0; i < vAlumnosNota.length; i++) {

            if (vAlumnosNota[i] > vAlumnosNota[posMejorAl]) {
                posMejorAl = i;
            }
            if (vAlumnosNota[i] < vAlumnosNota[posPeorAl]) {
                posPeorAl = i;
            }
        }
        System.out.printf("Las mejores notas son de %s , con una media de %.2f", alumnos[posMejorAl], vAlumnosNota[posMejorAl] / asignaturas.length);
        System.out.printf("Las peores notas son de %s , con una media de %.2f", alumnos[posPeorAl], vAlumnosNota[posPeorAl] / asignaturas.length);

        for (int j = 0; j < asignaturas.length; j++) {
            for (int i = 0; i < notas.length; i++) {
                vAsigNota[j] += notas[i][j];
            }
        }
        int posMejorAs = 0;
        int posPeorAs = 0;

        for (int i = 0; i < vAsigNota.length; i++) {

            if (vAsigNota[i] > vAsigNota[posMejorAs]) {
                posMejorAs = i;
            }
            if (vAsigNota[i] < vAsigNota[posPeorAs]) {
                posPeorAs = i;
            }
        }
        System.out.printf("Las mejores notas son de %s , con una media de %.2f", alumnos[posMejorAs], vAsigNota[posMejorAs] / asignaturas.length);
        System.out.printf("Las peores notas son de %s , con una media de %.2f", alumnos[posPeorAs], vAsigNota[posPeorAs] / asignaturas.length);
    }
}
