package app;

public class Estudiante {
    private String nombre;
    private int edad;
    private double[] notas;

    public Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = (notas != null) ? notas : new double[0];
    }

    public double calcularPromedio() {
        if (notas.length == 0) return 0.0;
        double suma = 0.0;
        for (double n : notas) suma += n;
        return suma / notas.length;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.print("Notas: ");
        for (double n : notas) {
            System.out.printf("%.2f ", n);
        }
        System.out.printf("%nPromedio: %.2f%n", calcularPromedio());
        System.out.println("----------------------");
    }

}

