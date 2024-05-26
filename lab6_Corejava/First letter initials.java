package lab

import java.util.Scanner;

public class FirstLetterInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.println("Enter a name (containing three words):");
        String fullName = sc.nextLine();

        // Close the scanner
        sc.close();

        // Extract and display the initials
        String initials = extractInitials(fullName);
        System.out.println("Initials: " + initials);
    }

    private static String extractInitials(String fullName) {
        // Split the full name into individual words
        String[] words = fullName.split(" ");

        // Ensure that there are exactly three words
        if (words.length != 3) {
            return "Error: Please enter exactly three words.";
        }

        // Extract the first letter of each word and concatenate them
        String initials = "";
        for (String word : words) {
            initials += word.charAt(0) + " ";
        }

        return initials.trim(); // Remove any trailing space
    }
}
