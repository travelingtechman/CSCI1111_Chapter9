import java.util.Scanner;
import java.lang.Math;
/**
 * 3/2/22
 * @author ethan
 *
 */
public class Exercise06_19 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the 3 sides of the triangle: ");	
		double side1 = scan.nextInt();
		double side2 = scan.nextInt();
		double side3 = scan.nextInt();
		
		isValid(side1,side2,side3);
		area(side1,side2,side3);	
	}
	/** Return true if the sum of every two sides is greater than the third side.*/
	public static boolean isValid(double side1, double side2, double side3) {
		
		if(side1+side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		} else {
			System.out.println("That is not a valid triangle");
			return false;	
		}
	}
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = ((side1+side2+side3)/2);
		double poop = (s *((s - side1) * (s - side2) * (s - side3)));
		double areeeea = Math.sqrt(poop);
		System.out.println("Side1:" + side1);
		System.out.println("Side2:" + side2);
		System.out.println("Side3:" + side3);
		System.out.println("Area: " + areeeea);
		return areeeea;
	}
}
