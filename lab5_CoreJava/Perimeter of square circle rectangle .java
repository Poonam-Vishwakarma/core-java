package lab;
import java.util.Scanner;

public class Perimeter
{
    public double perimeter(double s) {
        double p = 4 * s;
        return p;
    }
    
    public double perimeter(double l, double b) {
        double p = 2 * (l + b);
        return p;
    }
    
    public double perimeter(int c, double pi, double r) {
        double p = c * pi * r;
        return p;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Perimeter obj = new Perimeter();
        
        System.out.print("Enter side of square: ");
        double side = in.nextDouble();
        System.out.println("Perimeter of square = " + obj.perimeter(side));
        
        System.out.print("Enter length of rectangle: ");
        double l = in.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = in.nextDouble();
        System.out.println("Perimeter of rectangle = " + obj.perimeter(l, b));
        
        System.out.print("Enter radius of circle: ");
        double r = in.nextDouble();
        System.out.println("Perimeter of circle = " + obj.perimeter(2, 3.14159, r));
    }   
}	