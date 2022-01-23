// Calculate Discount Of Product

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the original price : ");
        double original_price = sc.nextDouble();
        System.out.println("Enter discount : ");
        double discount = sc.nextDouble();

        double dis = (discount/100) * original_price;
        double final_price = original_price - dis;

        System.out.println(final_price);
    }
}
