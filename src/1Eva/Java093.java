
public class Java093 {

    public static void main(String arg[]) {

        // division enteras mediante restas función recursiva
        System.out.println("División entera de 7/2 = " + division(7, 2));

    }

    public static int division(int a, int b) {
        if (a < b) {
            return 0;
        } else {
            return 1 + division(a - b, b);
        }
    }
}
