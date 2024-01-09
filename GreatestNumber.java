import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input three numbers
        System.out.print("Input the 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input the 2nd number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Input the 3rd number: ");
        double num3 = scanner.nextDouble();

        // Determining the greatest number among the three
        double greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        // Displaying the greatest number
        System.out.println("The greatest: " + greatest);

        scanner.close(); // Closing the scanner
    }
}
