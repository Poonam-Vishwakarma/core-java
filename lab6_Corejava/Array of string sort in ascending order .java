package lab;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of strings
        System.out.println("Enter the number of strings:");
        int numberOfStrings = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create an array to hold the strings
        String[] stringArray = new String[numberOfStrings];

        // Prompt the user to enter each string
        System.out.println("Enter the strings:");
        for (int i = 0; i < numberOfStrings; i++) {
            stringArray[i] = sc.nextLine();
        }

        // Close the scanner
        sc.close();

        // Sort the array in ascending order
        Arrays.sort(stringArray);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(stringArray));
    }
}
