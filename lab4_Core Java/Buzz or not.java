
import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (isBuzzNumber(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }
    }
    
    // Function to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        // Check if the number is divisible by 7 and ends with 7
        return (number % 7 == 0) || (number % 10 == 7);
    }
}
