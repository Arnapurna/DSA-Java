// Find Area of Rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length : ");
        double length = in.nextDouble();
        System.out.println("Enter Width : ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("Ares of rectangle is : "+area);
    }
}