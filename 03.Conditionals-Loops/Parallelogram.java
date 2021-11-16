// Find area of Parallelogram

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Base : ");
        double base = in.nextDouble();
        System.out.println("Enter Base : ");
        double height = in.nextDouble();
        double area = base* height;
        System.out.println("Area of Parallelogram is : "+area);
    }
}