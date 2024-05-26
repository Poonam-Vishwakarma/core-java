import java.util.Scanner;

public class KaprekarNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive whole number: ");
        int n = sc.nextInt();

        if (isKaprekarNumber(n)) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }
    }

    // Method to check if a number is a Kaprekar number
    public static boolean isKaprekarNumber(int n) {
        long square = (long) n * n;
        String squareStr = String.valueOf(square);
        int d = String.valueOf(n).length();
        int squareLength = squareStr.length();

        // Split the square into two parts
        String rightStr = squareStr.substring(squareLength - d);
        String leftStr = squareStr.substring(0, squareLength - d);

        // Convert strings to integers (or 0 if empty)
        int right = (rightStr.isEmpty()) ? 0 : Integer.parseInt(rightStr);
        int left = (leftStr.isEmpty()) ? 0 : Integer.parseInt(leftStr);

        // Check if sum of two parts equals original number
        return (left + right == n);
    }
}