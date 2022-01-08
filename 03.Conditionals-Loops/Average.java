// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number : ");
        int count = sc.nextInt();

        double[] a = new double[count];
        double sum =0;

        for(int i=0;i<a.length;i++){
            System.out.println("Enter "+(i+1)+"st number : ");
            a[i]= sc.nextDouble();
        }
        for(int i=0;i<a.length;i++){
           sum= sum + a[i];
        }
        double avg = sum/count;
        System.out.println("Average is : "+avg);
    }
}
