// Volume Of Prism

import java.util.Scanner;

public class VolumeOfPrism{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the base :");
        double b = in.nextDouble();
        System.out.println("Enter the height :");
        double h = in.nextDouble();
     
        double volume = b * h;
        System.out.println("Volume Of Prism is : " +volume);
    }
}