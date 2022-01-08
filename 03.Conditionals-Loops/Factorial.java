// Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){
        if(n==0)    return 1;
        else        return (n*fac(n-1));
    }
}
