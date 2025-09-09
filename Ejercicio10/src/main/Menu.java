package main;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private StringHandler handler;
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase inicial: ");
        String input = scanner.nextLine();
        handler = new StringHandler(input);
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\n=== MENU STRING HANDLER ===");
            System.out.println("1. Convertir a mayúsculas");
            System.out.println("2. Convertir a minúsculas");
            System.out.println("3. Invertir cadena");
            System.out.println("4. Verificar si es palíndromo");
            System.out.println("5. Mostrar palíndromos en la frase");
            System.out.println("6. Contar vocales y consonantes");
            System.out.println("7. Cambiar cadena");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Resultado: " + handler.toUpperCase());
                    break;
                case 2:
                    System.out.println("Resultado: " + handler.toLowerCase());
                    break;
                case 3:
                    System.out.println("Resultado: " + handler.reverse());
                    break;
                case 4:
                    if(handler.isPalindrome()) {
                        System.out.println("La cadena es palíndromo.");
                    } else {
                        System.out.println("La cadena no es palíndromo.");
                    }
                    break;
                case 5:
                    List<String> palindromes = handler.getPalindromesInPhrase();
                    if(palindromes.isEmpty()) {
                        System.out.println("No se encontraron palíndromos en la frase.");
                    } else {
                        System.out.println("Palíndromos encontrados: " + palindromes);
                    }
                    break;
                case 6:
                    handler.countVowelsAndConsonants();
                    break;
                case 7:
                    System.out.print("Ingrese una nueva palabra o frase: ");
                    String newInput = scanner.nextLine();
                    handler = new StringHandler(newInput);
                    System.out.println("La cadena ha sido cambiada.");
                    break;
                case 0:
                    System.out.println("gracias por usar el programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (option != 0);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
