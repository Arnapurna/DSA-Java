// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class SubtractProductSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int sub,product=1,sum=0;

        while(n>0){
            int rem = n%10;
            sum= sum + rem;
            product = product*rem;
            n = n/10;
        }
        sub = product - sum;
        System.out.println("Subtraction is : "+sub);

}