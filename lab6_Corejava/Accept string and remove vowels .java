package lab;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        // Close the scanner
        sc.close();

        // Call the method to remove vowels
        String resultString = removeVowels(inputString);

        // Display the result
        System.out.println("String after removing vowels: " + resultString);
    }

    private static String removeVowels(String input) {
        // Define a string containing all vowels
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Append the character to the result if it's not a vowel
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
