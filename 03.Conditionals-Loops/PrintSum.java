// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


import java.util.Scanner;

public class PrintSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum= 0;
        int n = input.nextInt();
       while(n>0){
        sum= sum+n;
       }
       System.out.println(sum);
    }
}