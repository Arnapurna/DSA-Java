// Total Surface Area Of Cube


import java.util.Scanner;

public class TotalSurfaceAreaOfCube{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double pi = 3.14;

        System.out.println("Enter the side :");
        double a = in.nextDouble();

      
        double area = 6 * a * a;
        System.out.println("Area Of Cube is : " +area);
    }
}