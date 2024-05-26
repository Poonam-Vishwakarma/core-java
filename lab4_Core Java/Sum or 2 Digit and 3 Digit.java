import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sumTwoDigit = 0, sumThreeDigit = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] >= 10 && numbers[i] <= 99) {
                sumTwoDigit += numbers[i];
            } else if (numbers[i] >= 100 && numbers[i] <= 999) {
                sumThreeDigit += numbers[i];
            }
        }

        System.out.println("Sum of two-digit numbers: " + sumTwoDigit);
        System.out.println("Sum of three-digit numbers: " + sumThreeDigit);
    }
}
