// Calculate Depreciation of Value

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter Amount : ");
        double amount = sc.nextDouble();
        System.out.println("Enter Depreciation percentage : ");
        int percentage = sc.nextInt();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        for (int i = 0; i < year; i++) {
            amount = ((100 - percentage) * amount) / 100;
        }
        System.out.println(amount);
    }
}
