// Volume Of Cone

import java.util.Scanner;

public class VolumeOfCone{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double pi = 3.14;


        System.out.println("Enter the radius :");
        double r = in.nextDouble();
        System.out.println("Enter the height :");
        double h = in.nextDouble();
     
        double volume = pi * r * r * (h/3);
        System.out.println("Volume Of Cone is : " +volume);
    }
}