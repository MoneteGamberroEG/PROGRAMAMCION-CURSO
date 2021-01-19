
public class Java045 {

    public static void main(String arg[]) {

        //Hacer un dialogo
        //llamar una función desde otra
        String palabras;
        escribir();
        hablar("Buenos días");
        animalHabla("perro", "gua gua");
        //palabras = concatenar ("En un lugar ", "de la Mancha");
        //System.out.println(palabras);
        System.out.printf("%s\n", concatenar("En un lugar ", "de la Mancha"));
        System.out.printf("La suma de 345 + 55 es %d", suma(345, 55));
    }

    public static void escribir() {
        System.out.println("hola");

    }

    public static void hablar(String frase) {
        System.out.println(frase);
    }

    public static void animalHabla(String frase, String onomatopeya) {
        System.out.println(frase + " : " + onomatopeya);
    }

    public static String concatenar(String frase1, String frase2) {
        return (frase1 + frase2);
    }

    public static int suma(int a, int b) {
        return (a + b);
    }
}
