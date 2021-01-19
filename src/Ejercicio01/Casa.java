
public class Casa {
	private String direccion;
	private int num_metros;
	private int num_habitaciones; //private es un modificador que encapsula el atributo
	private int num_banyos;
	
	public Casa (String dir, int nm, int nh, int nb) {
		direccion = dir;
		num_metros = nm;
		num_habitaciones = nh;
		num_banyos = nb;
	}
	public Casa (String dir) {
		direccion = dir;
		num_metros = 50;
		num_habitaciones = 2;
		num_banyos = 1;
	}
	
	public int getNumM() {
		return num_metros;
	}
	
	public int getNumHab() {
		return num_habitaciones;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String dir) {
		direccion= dir;
	}
	
	public void setNumM(int num) {
		num_metros = num;
	}
	
	public void setNumHab(int num) {
		num_habitaciones = num;
	}
	public int getBanyos() {
		return num_banyos;
	}
	public void setBanyos(int nb) {
		num_banyos = nb;
	}
	
	public void mostrar() {
		System.out.printf("Casa situada en %s con %d metros, %d habitaciones y %d baños ", direccion, num_metros, num_habitaciones, num_banyos);
	}
}
