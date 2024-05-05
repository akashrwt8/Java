package COURSE.CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class LeapYear {
    public boolean leapYear(int y) {
        if ((y % 4 == 0) && (y % 100 != 0 )|| (y % 400 == 0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check weather its leap year or not : ");
        int y = sc.nextInt();
        LeapYear obj = new LeapYear();
        if (obj.leapYear(y)) {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not a leap year");
        }
        sc.close();
    }
}
