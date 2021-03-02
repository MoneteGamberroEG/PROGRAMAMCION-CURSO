/*
 Mostrar por pantalla el empleado que mas cobra y su salario medio mensual.
 Mostrar tmb el que menos.
 Mostrar el mes que mas se cobra y su media por empleado y tb el mes en que menos
 */
public class Java037 {
	
	public static void main(String[] args) {
		int salarios[][] = {{700, 900, 1300, 800, 790, 850},
                                    {1000, 950, 1080, 1070, 1200, 1100},
                                    {1300, 930, 1280, 1170, 1600, 1530},
                                    {3000, 2900, 3540, 3060, 3460, 4100}};
		String empleados[] = {"Javier Marias", "Antonio Mu�oz", "Isabel Allende", "Jose Saramago"};
		String meses[] = {"Enero", "Febrero", "Marzo", "Marzo", "Abril", "Mayo", "Junio"};
		int empleadosAcum [] = {0, 0, 0, 0};
		int mesesAcum [] = {0, 0, 0, 0, 0, 0};
		int posmaxEmpleados = 0;
		int posminEmpleados = 0;
		int posmaxMes = 0;
		int posminMes = 0;
		for(int i = 0; i < salarios.length; i++) { 
			for(int j = 0; j < salarios[i].length; j++) {
				empleadosAcum[i] += salarios[i][j];
				mesesAcum[j] += salarios[i][j];
			}
		}
		for(int i = 1; i < empleados.length; i++) {
			if(empleadosAcum[i] > empleadosAcum[posmaxEmpleados]) {
				posmaxEmpleados = i;
			}
			if(empleadosAcum[i] < empleadosAcum[posminEmpleados]) {
				posminEmpleados = i;
			}
		}
		System.out.printf("El empleado con mejor salario es %s, con una media de %d � al mes \n", empleados[posmaxEmpleados], empleadosAcum[posmaxEmpleados]/meses.length);
		System.out.printf("El empleado con peor salario es %s, con una media de %d � al mes \n", empleados[posminEmpleados], empleadosAcum[posminEmpleados]/meses.length);
		for(int i = 1; i < mesesAcum.length; i++) {
			if(mesesAcum[i] > mesesAcum[posmaxMes]) {
				posmaxMes = i;
			}
			if(mesesAcum[i] < mesesAcum[posminMes]) {
				posminMes = i;
			}
		}
		System.out.printf("El mes que mas se cobra es %s, con una media de %d � al mes \n", meses[posmaxMes], mesesAcum[posmaxMes]/empleados.length);
		System.out.printf("El mes que menos se cobra es %s, con una media de %d � al mes \n", meses[posminMes], mesesAcum[posminMes]/empleados.length);
	}

}
