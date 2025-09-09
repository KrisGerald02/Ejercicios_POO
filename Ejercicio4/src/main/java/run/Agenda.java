package run;

public class Agenda {
    private Contacto[] contactos;
    private int contador;

    public Agenda(int capacidad) {
        contactos = new Contacto[capacidad];
        contador = 0;
    }

    public void agregarContacto(Contacto c) {
        if (contador < contactos.length) {
            contactos[contador] = c;
            contador++;
        } else {
            System.out.println("La agenda está llena.");
        }
    }

    public Contacto buscarPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return contactos[i];
            }
        }
        return null;
    }

    public void mostrarTodos() {
        if (contador == 0) {
            System.out.println("No hay contactos.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contactos[i]);
            }
        }
    }

    public void buscarPorDominio(String dominio) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getCorreo().endsWith(dominio)) {
                System.out.println(contactos[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron contactos con el dominio " + dominio);
        }
    }
}
