// Curved Surface Area Of Cylinder

import java.util.Scanner;

public class AreaOfCylinderCurvedSurface{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double pi = 3.14;

        System.out.println("Enter the radius :");
        double r = in.nextDouble();

        System.out.println("Enter the height :");
        double h = in.nextDouble();
     
        double area = 2 * pi * r * h;
        System.out.println("Area Of Cylinder is : " +area);
    }
}