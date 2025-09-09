package run;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para añadir productos
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado correctamente.");
    }

    // Método para buscar por código
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    // Método para mostrar productos con stock > 5
    public void mostrarStockMayorCinco() {
        System.out.println("Productos con stock mayor a 5:");
        boolean hay = false;
        for (Producto p : productos) {
            if (p.getCantidad() > 5) {
                System.out.println(p);
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("No hay productos con stock mayor a 5.");
        }
    }
}
