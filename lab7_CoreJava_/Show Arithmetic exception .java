package lab;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner p = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the numerator: ");
        int numerator = p.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = p.nextInt();

        try {
            // Attempt to divide the numerator by the denominator
            int result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }

        // Close the scanner
        scanner.close();
    }
}
