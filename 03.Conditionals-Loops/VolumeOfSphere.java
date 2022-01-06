// Volume Of Sphere

import java.util.Scanner;

public class VolumeOfSphere{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double pi = 3.14;

        System.out.println("Enter the radius :");
        double r = in.nextDouble();
     
        double volume = (4/3) * pi * r * r * r;
        System.out.println("Volume Of Sphere is : " +volume);
    }
}