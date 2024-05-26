package lab;

import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        sc.close();

        String longestWord = findLongestWord(str);
        System.out.println("The longest word is: " + longestWord);
    }

    private static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
