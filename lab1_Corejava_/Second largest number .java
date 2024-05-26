// write a program to input 3 no find the 2nd largest no using math function
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double secondLargest = findSecondLargest(num1, num2, num3);
        
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static double findSecondLargest(double a, double b, double c) {
        double max = Math.max(Math.max(a, b), c);
        double min = Math.min(Math.min(a, b), c);
        
        // Find the middle number by checking which number is neither maximum nor minimum
        double secondLargest = a + b + c - max - min;
        return secondLargest;
    }
}
