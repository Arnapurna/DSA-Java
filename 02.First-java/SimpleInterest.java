// Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;

public class SimpleInterest{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        int principle = input.nextInt();
        System.out.print("Enter time : ");
        int time = input.nextInt();
        System.out.print("Enter rate of interest : ");
        float rate = input.nextFloat();
        double simpleInterest = (principle*time*rate)/100;
        System.out.println("Simple interest is : "+simpleInterest);
    }
}