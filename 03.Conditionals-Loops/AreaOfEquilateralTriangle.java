//  Find area of Equilateral Triangle

import java.util.Scanner;

public class  AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side : ");
        double a = in.nextDouble();
        double area = (1.732/4)*a*a;
        System.out.println("Area of Equilateral Triangle is "+area);
    }
}