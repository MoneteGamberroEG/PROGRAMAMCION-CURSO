
public class Java096 {

    public static void main(String arg[]) {

        //pasar a binario
        int x = 14;

        /*while(x >0){
            System.out.print("" + (x % 2));
            x /= 2;
        }*/
        enBinario(x);
    }

    public static void enBinario(int x) {
        if (x == 0) {
            //System.out.print("" + (x % 2));
            return;
        } else {
            enBinario(x / 2);
            System.out.print("" + (x % 2));
            return;
        }
    }
}
