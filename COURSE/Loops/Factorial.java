package COURSE.Loops;

import java.util.Scanner;

public class Factorial {
    public static double factorial(double d) {
        if (d == 0) {
            return 1;
        }
        return d * factorial(d - 1);
    }
    public static void fact(double d) {
        int n = (int)d;
        for (int i = 1; i < n; i++) {
           d *= i;
        }
        System.out.println("Factroial (iteration) of " + n + " is " + d);
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial of : ");
        double d = sc.nextDouble();
        System.out.println("Factroial of " + d  + " is " + factorial(d));
        fact(d);
        sc.close();
    }
}
