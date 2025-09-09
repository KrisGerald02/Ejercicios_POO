import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear arreglo de libros
        System.out.print("¿Cuantos libros desea registrar?: ");
        int n = Integer.parseInt(sc.nextLine());
        Libro[] libros = new Libro[n];

        // Ingreso de datos
        for (int i = 0; i < n; i++) {
            System.out.println("\nRegistro del libro " + (i + 1));
            System.out.print("Titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Anio de publicacion: ");
            int anio = Integer.parseInt(sc.nextLine());

            libros[i] = new Libro(titulo, autor, anio);
        }

        // Buscar por autor o palabra clave
        System.out.print("\nIngrese autor o palabra clave para buscar: ");
        String busqueda = sc.nextLine().toLowerCase();

        System.out.println("Resultados de busqueda");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAutor().toLowerCase().contains(busqueda) ||
                    l.getTitulo().toLowerCase().contains(busqueda)) {
                l.mostrarDatos();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros.");
        }

        // Mostrar libros después de 2010
        System.out.println("\nLibros publicados despues de 2010");
        boolean alguno = false;
        for (Libro l : libros) {
            if (l.getAnio() > 2010) {
                l.mostrarDatos();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay libros publicados despues de 2010.");
        }

        sc.close();
    }
}
