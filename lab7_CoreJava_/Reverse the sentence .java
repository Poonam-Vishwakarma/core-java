package lab;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner p = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the sentence which you want to reverse: ");
        String sentence = p.nextLine();

        // Reverse the sentence
        String reversedSentence = reverseSentence(sentence);

        // Display the result
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Initialize a StringBuilder to store the reversed sentence
        StringBuilder reversed = new StringBuilder();

        // Loop through the words array in reverse order and append to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}
