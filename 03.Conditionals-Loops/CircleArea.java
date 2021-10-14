// Area of Circle

import java.util.Scanner;
import java.lang.Math;

public class CircleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of the circle : ");
        int radius = input.nextInt();
        
        double area = Math.PI*(radius*radius);
        System.out.println("Area of Circle is : "+area);
    }
}