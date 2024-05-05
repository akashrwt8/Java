import java.util.Scanner;

class SwapUsingBitwise {
    void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter value of b : ");
            int b = sc.nextInt();
            SwapUsingBitwise obj = new SwapUsingBitwise();
            obj.swap(a, b);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
                System.out.println("Scanner closed");
            }
        }
    }
}
