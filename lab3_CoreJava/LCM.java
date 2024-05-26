package lab;

import java.util.Scanner;

public class lcm {
	
	    
	    public static void main(String args[]) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int x = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int y = sc.nextInt();
	        
	        lcm pr = new lcm();
	        pr.lcm(x, y);
	    }


public static void lcm(int a, int b) {
    int x = a, y = b;
    while (y != 0) {
        int t = y;
        y = x % y;
        x = t;
    }
    
    int lcm = (a * b) / x;
    
    System.out.println("LCM = " + lcm);
}
}
