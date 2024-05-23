package COURSE.Loops;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            rev = rev * 10 + d;
        }
        if (temp == rev) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome : ");
        int n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
}

