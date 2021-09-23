// Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeeToDollar{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in rupees : ");
        int rupees = input.nextInt();
        System.out.println(rupees*0.014 +"$");
    }
}