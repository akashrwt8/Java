import java.util.Scanner;
class AreaOfTriangle {
	public static double areaOfTriangle(float s1, float s2, float s3) {
		float sum = s1 + s2 + s3;
		System.out.println("Perimeter of triangle is " + sum);
		sum /= 2;
		float temp = (sum) * (sum - s1) * (sum - s2) * (sum - s3);
		double area = Math.sqrt(temp);
		return area;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side one of trinagle : ");
		float s1 = sc.nextFloat();
		System.out.print("Enter side two of trinagle : ");
		float s2 = sc.nextFloat();
		System.out.print("Enter side three of trinagle : ");
		float s3 = sc.nextFloat();
		System.out.println("Area of trinagle is " + areaOfTriangle(s1, s2, s3) + " squnit");
		sc.close();
	}
}