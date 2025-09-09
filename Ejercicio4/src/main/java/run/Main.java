package run;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(100); // capacidad máxima
        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Buscar por dominio");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, telefono, correo));
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscarNombre = sc.nextLine();
                    Contacto c = agenda.buscarPorNombre(buscarNombre);
                    if (c != null) {
                        System.out.println("Encontrado: " + c);
                    } else {
                        System.out.println("No existe el contacto.");
                    }
                    break;

                case 3:
                    agenda.mostrarTodos();
                    break;

                case 4:
                    System.out.print("Dominio a buscar (ejemplo: @gmail.com): ");
                    String dominio = sc.nextLine();
                    agenda.buscarPorDominio(dominio);
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el programa");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
