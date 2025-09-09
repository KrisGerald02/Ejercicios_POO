import app.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cant = leerEntero(sc);
        Estudiante[] estudiantes = new Estudiante[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("\nRegistro del estudiante" + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine().trim();
            while (nombre.isEmpty()) {
                System.out.print("Nombre vacio. Escriba el nombre: ");
                nombre = sc.nextLine().trim();
            }

            System.out.print("Edad: ");
            int edad = leerEntero(sc);

            System.out.print("Cantidad de notas: ");
            int numNotas = leerEntero(sc);
            while (numNotas < 0) {
                System.out.print("La cantidad de notas no puede ser negativa. Ingrese de nuevo: ");
                numNotas = leerEntero(sc);
            }

            double[] notas = new double[numNotas];
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = leerDouble(sc);
            }

            estudiantes[i] = new Estudiante(nombre, edad, notas);
        }

        System.out.println("\nEstudiantes con promedio mayor a 8.0");
        boolean alguno = false;
        for (Estudiante e : estudiantes) {
            if (e.calcularPromedio() > 8.0) {
                e.mostrarDatos();
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("Ninguno cumple la condicion.");
        }

        sc.close();
    }

    // lee entero y le puse textline para evitar problema con el scanner
    private static int leerEntero(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.print("Valor invalido. ingrese un otro numeroS: ");
            }
        }
    }

    // aqui leo double le puse que acepte comas o puntos para el valor
    private static double leerDouble(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException ex) {
                System.out.print("Valor invalido, ingrese otro numero porfavor ");
            }
        }
    }
}
