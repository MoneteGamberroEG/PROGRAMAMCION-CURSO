package Ejercicio03;

public class EjecutableNif {

	public static void main(String[] args) throws NifException {
		try {
			int a = 7/0;
		}catch(Exception ppp) {
			System.out.println("Has divivdido por 0");
		}
		System.out.println("Hola");
		
		Nif numero1 = new Nif(25000000, 'N');
		numero1.escribir();
		Nif numero2 = new Nif(77216660);
		numero2.escribir();
	}

}
