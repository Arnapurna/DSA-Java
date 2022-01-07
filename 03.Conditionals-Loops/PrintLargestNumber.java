// Take integer inputs till the user enters 0 and print the largest number from all

import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n2 =0;
        int n = input.nextInt();
       while(n>0){
        if(n2<n){
            n2=n;
        }
       }
       System.out.println(n);
    }
}
