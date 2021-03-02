package Ejercicio02;

public class Perro extends Animal{
	String raza;
	boolean peligrosidad;
	
	public Perro(int ID, String fn, boolean vacunado, String nombre, String raza, boolean peligro) {
		super(ID, fn, vacunado, nombre);
		this.raza = raza;
		peligrosidad = peligro;
	}
	
	public void habla() {
		System.out.printf("Guau, guau, soy un perro de raza %s, naci el %s y me llamo %s\n", raza, fnac, getNombre());
	}
}
