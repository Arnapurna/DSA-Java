// Calculate Power

import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= 2;
        int b= 3;

        System.out.println("Enter two numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        double result = Math.pow(a, b);
        System.out.println(result);
    }
}
