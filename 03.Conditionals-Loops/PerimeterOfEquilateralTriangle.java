// Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side :");
        double side = in.nextDouble();
       
        double perimeter = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle is "+perimeter);
    }
}