package Ejercicio06;

abstract class Animal {
	int ID;
	String fnac;
	boolean vacunado;
	private String nombre;
	
	public Animal(int ID, String fn, boolean vacunado, String nombre) {
		this.ID = ID;
		fnac = fn;
		this.vacunado = vacunado;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre = n;	
	}
	
	abstract void habla();
	
}
