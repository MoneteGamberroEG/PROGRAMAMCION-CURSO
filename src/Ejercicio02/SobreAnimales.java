package Ejercicio02;

public class SobreAnimales {

	public static void main(String[] args) {
		Perro animal1 = new Perro(1, "12/10/2019", true, "Tobby", "Chiguagua", true);
		Canguro animal2 = new Canguro(2, "10/07/2020", false, "Ronny", 13, 65);
		animal1.habla();
		animal2.habla();
		
	}

}
