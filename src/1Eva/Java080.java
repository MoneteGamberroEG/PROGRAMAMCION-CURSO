
public class Java080 {

    public static void main(String arg[]) {

        //reemplazar caracteres con la función .replace 
        //usamos la función indexf para encontar la posición de la palabra
        String frase = "En un lugar lugar de la Mancha, de cuyo nombre no quiero acordarme";

        //reemplazar a por X
        frase = frase.replace('a', 'X');
        System.out.println(frase);

        //reemplazar lugXr por sitio
        frase = frase.replace("lugXr", "sitio");
        System.out.println(frase);

        //posición donde se encuentra la palabra/ sabiendo donde están
        System.out.printf("La palabra sitio se encuentra en la posición %d\n", frase.indexOf("sitio"));
        System.out.printf("La palabra sitio se encuentra en la posición %d\n", frase.indexOf("sitio", 10));

        //Nº de veces que se encuentra la palabra "sitio" en la frase y donde se encuentran
        int cont = 0;
        int posicion = frase.indexOf("sitio");
        while (posicion != -1) {
            cont++;
            System.out.println("Encontrado en la posición " + posicion);
            posicion = frase.indexOf("sitio", posicion + 1);
        }
        System.out.println("Nº de veces que aparece = " + cont);
    }
}
