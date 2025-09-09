package run;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        boolean salir = false;
        while (!salir) {
            System.out.println("Menu");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por codigo");
            System.out.println("3. Mostrar productos con stock > 5");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    Producto p = new Producto();
                    System.out.print("Ingrese nombre: ");
                    p.setNombre(sc.nextLine());

                    System.out.print("Ingrese codigo: ");
                    p.setCodigo(sc.nextLine());

                    System.out.print("Ingrese cantidad: ");
                    p.setCantidad(sc.nextInt());
                    sc.nextLine();

                    inventario.agregarProducto(p);
                    break;

                case 2:
                    System.out.print("Ingrese el coigo a buscar: ");
                    String codigo = sc.nextLine();
                    Producto encontrado = inventario.buscarPorCodigo(codigo);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontro el producto.");
                    }
                    break;

                case 3:
                    inventario.mostrarStockMayorCinco();
                    break;

                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }
}
