
public class Java092 {

    public static void main(String arg[]) {

        //ejemplo demostración backtracking 
        mostrarFrase(5);
    }

    public static void mostrarFrase(int a) {
        if (a > 0) {
            System.out.println("mostrarFrase(" + a + ")");
            mostrarFrase(a - 1);
            System.out.println("mostrarFrase(" + a + ")");
        }
    }
}
