package COURSE.Loops;

import java.util.Scanner;

public class Table {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + " = " + (i * n));
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print it's table : ");
        int n = sc.nextInt();
        table(n);
        sc.close();
    }
}
