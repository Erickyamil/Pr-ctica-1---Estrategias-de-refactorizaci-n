import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputValidator validator = new InputValidator(input);

        int from = validator.getValidInt("Ingresa tu primer valor: "); //
        int to = validator.getValidInt("Ingresa tu segundo valor: ");

        input.close();

        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(from, to);
    }
}