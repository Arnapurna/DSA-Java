// Perimeter Of Square

import java.util.Scanner;

public class PerimeterOfSquare{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the side :");
        double side = in.nextDouble();
       
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Square is "+perimeter);
    }
}