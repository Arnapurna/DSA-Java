// Calculate Commission Percentage

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price : ");
        double price = sc.nextDouble();
        System.out.println("Enter Commision Percentage : ");
        double percentage = sc.nextDouble();

        double commision = (price * percentage) / 100;
        System.out.println(commision);
    }
}
