import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        
        // Reading the number provided by the user
        double number = scanner.nextDouble();
        
        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number entered is positive.");
        } else if (number < 0) {
            System.out.println("The number entered is negative.");
        } else {
            System.out.println("The number entered is zero.");
        }
        
        scanner.close(); // Closing the scanner
    }
}
