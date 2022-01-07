// Find area of triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height of the triangle : ");
        double height = input.nextDouble();

        System.out.println("Enter base of the triangle : ");
        double base = input.nextDouble();
        
        double area = (height*base)/2;
        System.out.println("Area of the trinagle is : " + area);

    }
}