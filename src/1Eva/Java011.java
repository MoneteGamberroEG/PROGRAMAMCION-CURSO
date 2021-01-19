
public class Java011 {

    public static void main(String arg[]) {

        //que aparezca la multiplicación
        int numero1;
        int numero2;
        int resultado;

        numero1 = 4;
        numero2 = 6;
        resultado = 0;

        for (int cont = 1; cont <= numero2; cont++) {
            resultado = resultado + numero1;
        }
        System.out.println(numero1 + "x" + numero2 + "=" + resultado);

    }
}
