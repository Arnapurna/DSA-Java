// Perimeter Of Rhombu

import java.util.Scanner;

public class PerimeterOfRhombus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the side :");
        double side = in.nextDouble();
     
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Rhombus is "+perimeter);
    }
}