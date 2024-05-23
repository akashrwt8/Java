package COURSE.Loops;
import java.util.Scanner;

public class Reverse {
    public static void reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            rev = rev * 10 + d;
        }
        System.out.println("Reverse of " + n + " is " + rev);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find reverse of : ");
        int n = sc.nextInt();
        reverse(n);
        sc.close();
    }
}
