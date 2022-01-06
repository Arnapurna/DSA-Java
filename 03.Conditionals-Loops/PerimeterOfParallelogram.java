// Perimeter Of Parallelogram


import java.util.Scanner;

public class PerimeterOfParallelogram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the base :");
        double base = in.nextDouble();
        System.out.println("Enter the side :");
        double side = in.nextDouble();
       
        double perimeter = 2 * (base+side);
        System.out.println("Perimeter Of Parallelogram is "+perimeter);
    }
}