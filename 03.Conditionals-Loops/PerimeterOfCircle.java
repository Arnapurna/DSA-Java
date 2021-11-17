// Find Perimeter Of Circle

import java.util.Scanner;

public class PerimeterOfCircle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius :");
        double radius = in.nextDouble();
        double perimeter = 2 * (3.14) * radius;
        System.out.println("Perimeter Of Circle is "+perimeter);
    }
}