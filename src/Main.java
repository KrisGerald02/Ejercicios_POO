import java.util.Scanner;
import Models.Curso;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = sc.nextLine();

        System.out.println("Ingrese la cantidad de estudiantes:");
        int estudiantes = sc.nextInt();

        System.out.println("Ingrese la cantidad de evaluaciones:");
        int evaluaciones = sc.nextInt();

        double[][] notas = new double[estudiantes][evaluaciones];

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("\nNotas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < evaluaciones; j++) {
                System.out.print(" Evaluación " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        Curso curso = new Curso(nombreCurso, notas);

        System.out.println("\n--- Promedios por estudiante ---");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + curso.promedioEstudiante(i));
        }

        System.out.println("\n--- Promedios por evaluación ---");
        for (int j = 0; j < evaluaciones; j++) {
            System.out.println("Evaluación " + (j + 1) + ": " + curso.promedioEvaluacion(j));
        }

        int mejor = curso.mejorEstudiante();
        System.out.println("\nEl estudiante con mejor rendimiento es el #" + (mejor + 1));

        sc.close();
    }
}
