import java.util.Scanner;

public class WeekdayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input a number
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        // Mapping the number to a weekday
        String dayName;

        switch (number) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid input. Please enter a number between 1 and 7.";
                break;
        }

        // Displaying the corresponding weekday or error message
        System.out.println("Expected Output:");
        System.out.println(dayName);

        scanner.close(); // Closing the scanner
    }
}
