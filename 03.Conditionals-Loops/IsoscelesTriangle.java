

import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
        System.out.println("Enter Base : ");
        double base = in.nextDouble();
         System.out.println("Enter Height : ");
        double Height = in.nextDouble();
        double area = (base*height)/2;
        System.out.println("Area of Isosceles Triangle is : "+area);
    
    }
}