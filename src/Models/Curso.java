package Models;

public class Curso {
    private String nombre;
    private double[][] notas; // filas = estudiantes, columnas = evaluaciones

    public Curso(String nombre, double[][] notas) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del curso no puede estar vacío");
        }
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("La matriz de notas no puede estar vacía");
        }
        this.nombre = nombre;
        this.notas = notas;
    }

    public double promedioEstudiante(int indiceEstudiante) {
        if (indiceEstudiante < 0 || indiceEstudiante >= notas.length) {
            throw new IllegalArgumentException("Índice de estudiante inválido");
        }
        double suma = 0;
        for (double nota : notas[indiceEstudiante]) {
            suma += nota;
        }
        return suma / notas[indiceEstudiante].length;
    }

    public double promedioEvaluacion(int indiceEvaluacion) {
        if (indiceEvaluacion < 0 || indiceEvaluacion >= notas[0].length) {
            throw new IllegalArgumentException("Índice de evaluación inválido");
        }
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][indiceEvaluacion];
        }
        return suma / notas.length;
    }

    public int mejorEstudiante() {
        int mejor = 0;
        double mejorPromedio = promedioEstudiante(0);

        for (int i = 1; i < notas.length; i++) {
            double promedio = promedioEstudiante(i);
            if (promedio > mejorPromedio) {
                mejor = i;
                mejorPromedio = promedio;
            }
        }
        return mejor;
    }

    public String getNombre() {
        return nombre;
    }
}
