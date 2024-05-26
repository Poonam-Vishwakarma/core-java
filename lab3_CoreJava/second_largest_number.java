package lab;

import java.util.Scanner;

public class highest {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the number of elements in the array: ");
		        int n = sc.nextInt();
		        
		        if (n < 2) {
		            System.out.println("Array must contain at least two elements.");
		            return;
		        }

		        int[] arr = new int[n];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int largest = Integer.MIN_VALUE;
		        int secondLargest = Integer.MIN_VALUE;

		        for (int num : arr) {
		            if (num > largest) {
		                secondLargest = largest;
		                largest = num;
		            } else if (num > secondLargest && num != largest) {
		                secondLargest = num;
		            }
		        }

		        System.out.println("The given array is:");
		        for (int num : arr) {
		            System.out.print(num + "\t");
		        }

		        if (secondLargest == Integer.MIN_VALUE) {
		            System.out.println("\nNo valid second largest number found (all elements might be the same).");
		        } else {
		            System.out.println("\nSecond largest number is: " + secondLargest);
		        }

		        sc.close();
		    }
		}
