// Volume Of Pyramid

import java.util.Scanner;

public class VolumeOfPyramid{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the length :");
        double l = in.nextDouble();

        System.out.println("Enter the width :");
        double w = in.nextDouble();

        System.out.println("Enter the height :");
        double h = in.nextDouble();
     
        double volume = (l * w * h/3);
        System.out.println("Volume Of Pyramid is : " +volume);
    }
}