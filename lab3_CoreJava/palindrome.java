package lab;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		int p = n; 

		int reversed = 0;
		while (n != 0) {
			int remainder = n % 10;
		            reversed = reversed * 10 + remainder;
		            n /= 10;
		        }

		        if (p == reversed) {
		            System.out.println(p + " is a palindrome.");
		        } else {
		            System.out.println(p + " is not a palindrome.");
		        }
		    }


	}


