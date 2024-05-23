package COURSE.Loops;

import java.util.Scanner;

public class CountDigit {

    public static int count(int n) {
        int c = 0;
        while (n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count it's digit : ");
        int n = sc.nextInt();
        System.out.print("Digit count is " + count(n));
        sc.close();
    }
}

