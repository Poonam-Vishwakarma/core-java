package lab;
import java.util.Scanner;

public class SurnameFirstNameMidName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.println("Enter a name (containing three words):");
        String fullName = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Reformat and display the name
        String reformattedName = reformatName(fullName);
        System.out.println("Reformatted name: " + reformattedName);
    }

    private static String reformatName(String fullName) {
        // Split the full name into individual words
        String[] words = fullName.split(" ");

        // Ensure that there are exactly three words
        if (words.length != 3) {
            return "Error: Please enter exactly three words.";
        }

        // Reformat the name as "Surname Firstname Middlename"
        String surnameFirstFormat = words[2] + " " + words[0] + " " + words[1];
        return surnameFirstFormat;
    }
}
