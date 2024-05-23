package COURSE.Loops;

import java.util.Scanner;

public class DisplayDigit {
    public static void display(int n) {
        System.out.print("Digit of n are ");
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            System.out.print(d + ", ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display it's digit : ");
        int n = sc.nextInt();
        display(n);
        sc.close();
    }
}
