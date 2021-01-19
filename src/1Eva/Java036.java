
public class Java036 {

    public static void main(String arg[]) {

        //Sacar listado de 10, que aprezca el nombre del alumno y en que asignatura
        int notas[][] = {{7, 9, 10, 8}, {10, 9, 9, 10}, {9, 5, 6, 10}, {8, 5, 4, 5}, {3, 10, 5, 6}};
        String alumnos[] = {"Javier", "Alejandro", "Eduardo", "Daniel", "Pedro"};
        String asignaturas[] = {"Programacion", "Sistemas", "Marcas", "Bases de datos"};

        System.out.println("Listado de DIECES : ");

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                if (notas[i][j] == 10) {
                    System.out.printf("%s en %s \n", alumnos[i], asignaturas[j]);
                }
            }
        }

    }
}
