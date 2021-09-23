// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter operator : ");
        char operator = input.next().charAt(0);

        if(operator == '+') System.out.println (num1+num2);
        if(operator == '-') System.out.println (num1-num2);
        if(operator == '*') System.out.println (num1*num2);
        if(operator == '/') System.out.println (num1/num2);

       

    }
}