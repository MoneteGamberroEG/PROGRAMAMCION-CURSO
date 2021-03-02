/*
 Que pelicula y en que dia tuvo m�s audiencia y cuantas entradas se vendieron y tb el q menos
 */
public class Java034 {

	public static void main(String[] args) {
		int salas[][] = {{100, 20, 3, 40, 70, 1500, 250},{50, 60, 70, 80, 156, 250, 164},{90, 100, 110, 120, 25, 50, 179},{30, 10, 30, 45, 85, 110, 120}};
		String peliculas[] = {"Avengers", "Marte", "Star Wars", "El Se�or de los Anillos"};
		String dias[] = {"Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo"};
		int posmaxf = 0;
		int posmaxc = 0;
		int posminf = 0;
		int posminc = 0;
		for(int i = 0; i < salas.length; i++) {
			for(int j = 0; j < salas[i].length; j++) {
				if(salas[i][j] > salas[posmaxf][posmaxc]) {
					posmaxf = i;
					posmaxc = j;
				}
				if(salas[i][j] < salas[posminf][posminc]) {
					posminf = i;
					posminc = j;
				}
			}
		}
		System.out.printf("%s el %s tuvo m�xima audiencia con %d espectadores\n", peliculas[posmaxf], dias[posmaxc], salas[posmaxf][posmaxc]);
		System.out.printf("%s el %s tuvo la menor audiencia con %d espectadores\n", peliculas[posminf], dias[posmaxc], salas[posminf][posminc]);
	}

}
