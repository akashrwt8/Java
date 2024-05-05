package COURSE.CONDITIONAL_STATEMENT;

import java.util.Scanner;

class ODDEVEN {
    public boolean evenodd(int n) {
        if ((n & 1) == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to check even or odd : ");
        int n = sc.nextInt();
        ODDEVEN obj = new ODDEVEN();
        if (obj.evenodd(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}