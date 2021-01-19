
public class Java094 {

    public static void main(String arg[]) {

        /*Hacer una funcion que se llame campanadas a la que le pases un 
        * entero entre 1 y 24 ynos diga cuantas campanafdas ha tocado hasta 
        * ese momento en lo q va de día
        * 
        * Primero sin recursividad y segundo con recursividad
         */
        System.out.println("Número de campanadas: " + campanadas2(3));
    }

    public static int campanadas1(int hora) {
        int acum = 0;
        for (int i = 1; i < hora; i++) {
            if (i > 12) {
                acum += i;
            } else {
                acum += i;
            }
        }
        return acum;
    }

    public static int campanadas2(int hora) {
        if (hora == 1) {
            return 1;
        } else if (hora > 12) {
            return (hora - 12) + campanadas2(hora - 1);
        } else {
            return hora + campanadas2(hora - 1);
        }
    }
}
