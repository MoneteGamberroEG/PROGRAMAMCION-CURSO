package Ejercicio02;

	public class Canguro extends Animal{
		int salto;
		int velocidad;
		
		public Canguro(int ID, String fn, boolean vacunado, String nombre, int salto, int velocidad) {
			super(ID, fn, vacunado, nombre);
			this.salto = salto;
			this.velocidad = velocidad;
		}
		public void habla() {
			System.out.printf("Oing, Oing, soy un canguro, salto %d, naci el %s y me llamo %s\n", salto, fnac, getNombre());
		}

}
