import java.util.Scanner;

class InputValidator {
    private Scanner scanner;

    public InputValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getValidInt(String message) {
        int number;
        while (true) {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                return number; // Retorna el número si es válido
            } catch (Exception Leny) {
                System.out.println("Error: Entrada no válida. Intenta de nuevo.");
                Leny.printStackTrace();
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }
    }
}
