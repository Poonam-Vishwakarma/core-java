package lab;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String Str = sc.nextLine();

        // Check for palindrome
        if (isPalindrome(Str)) {
            System.out.println("\"" + Str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + Str + "\" is not a palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // Remove spaces and convert to lowercase for uniformity
        s = s.replaceAll("\\s", "").toLowerCase();

        // Get the length of the string
        int length = s.length();

        // Compare characters from the beginning and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
