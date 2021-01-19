
public class Java004 {

    public static void main(String arg[]) {

        int x, y, z;
        x = 34;
        y = 12;
        z = 44;
        if (x > y) {
            if (x > z) {
                System.out.println("El mayor es " + x);

            } else {
                System.out.println("El mayor es " + z);
            }
        } else {
            if (y > z) {
                System.out.println("El mayor es " + y);
            } else {
                System.out.println("El mayor es" + z);
            }
        }

    }

}
