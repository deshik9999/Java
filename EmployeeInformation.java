import java.util.Scanner;

public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking employee information from the user
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Employee Address: ");
        String employeeAddress = scanner.nextLine();

        System.out.print("Enter Employee Contact: ");
        String employeeContact = scanner.nextLine();

        System.out.print("Enter Employee Gender (M/F): ");
        char employeeGender = scanner.next().charAt(0);

        // Displaying the entered employee information
        System.out.println("\nEntered Employee Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Contact: " + employeeContact);
        System.out.println("Employee Gender: " + employeeGender);

        scanner.close(); // Closing the scanner
    }
}
