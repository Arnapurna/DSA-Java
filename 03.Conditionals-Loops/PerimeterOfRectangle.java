// Perimeter Of Rectangle


import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the length :");
        double length = in.nextDouble();
        System.out.println("Enter the width :");
        double width = in.nextDouble();
       
        double perimeter = 2 * (length+width);
        System.out.println("Perimeter Of Rectangle is "+perimeter);
    }
}