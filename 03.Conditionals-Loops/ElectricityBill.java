// Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the unit : ");
        long units = sc.nextLong();
        double bill = 0.0;

        if(units<100)   bill= units*1.20;
        else if(units<300)      bill= 100*1.20 + (units-100)*2;
        else if(units>300)      bill = 100*1.2 + 200*2 +(units-300)*3;
       System.out.println("Bills to pay : "+bill);
    }
}
