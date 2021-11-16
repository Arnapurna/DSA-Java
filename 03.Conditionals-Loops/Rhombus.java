// Find area of Rhombus

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter both diagonals : ");
        double diagonal1 = in.nextDouble();
        double diagonal2 = in.nextDouble();
        double area = (diagonal1 * diagonal2)/2;
        System.out.println("Area of Rhombus is : "+area);
    }
}