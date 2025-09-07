<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto u oración:");
        String texto = sc.nextLine();
        AnalizadorTexto analizador = new AnalizadorTexto(texto);

        System.out.println("\nEl texto tiene " + analizador.contarPalabras() + " palabras.");

        System.out.println("\nIngrese la palabra que desea contar:");
        String palabra = sc.nextLine();
        int ocurrencias = analizador.contarOcurrencias(palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces.");

        System.out.println("\n¿Desea reemplazar una palabra? (si/no)");
        String opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Ingrese la palabra que desea reemplazar:");
            String original = sc.nextLine();

            System.out.println("Ingrese la nueva palabra:");
            String nueva = sc.nextLine();

            String textoReemplazado = analizador.reemplazarPalabra(original, nueva);
            System.out.println("\nTexto resultante:");
            System.out.println(textoReemplazado);
        }

        sc.close();
    }
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto u oración:");
        String texto = sc.nextLine();
        AnalizadorTexto analizador = new AnalizadorTexto(texto);

        System.out.println("\nEl texto tiene " + analizador.contarPalabras() + " palabras.");

        System.out.println("\nIngrese la palabra que desea contar:");
        String palabra = sc.nextLine();
        int ocurrencias = analizador.contarOcurrencias(palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces.");

        System.out.println("\n¿Desea reemplazar una palabra? (si/no)");
        String opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("si")) {
            System.out.println("Ingrese la palabra que desea reemplazar:");
            String original = sc.nextLine();

            System.out.println("Ingrese la nueva palabra:");
            String nueva = sc.nextLine();

            String textoReemplazado = analizador.reemplazarPalabra(original, nueva);
            System.out.println("\nTexto resultante:");
            System.out.println(textoReemplazado);
        }

        sc.close();
    }
}
>>>>>>> ca9fc78 (Reemplazo dearchivos por unos nuevos con mejoras leves)
