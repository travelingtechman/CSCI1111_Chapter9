package courseWork;
/**
 * Ethan Hunt
 * 3/8/22
 */
import java.util.Scanner;

public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Password: ");
		String s = scan.nextLine();
		
		if(isValid(s) == true) {
			System.out.println("Valid Password");
		} else if(isValid(s) == false) {
			System.out.println("Invalid Password");
		}

	}
	public static boolean isValid(String s) {
		boolean valid = true;
		char c;
		int count = 0, digit = 0;
		
		
		for(int i = 0; i < s.length(); i++ ) {
			c = s.charAt(i);
			if(Character.isLetterOrDigit(c)==true) {
				count++;
				if(Character.isDigit(c)) {
					digit++;
				}
			} else {
				valid = false;
			}
		}
		if(valid != false && count >= 8 && digit >= 2) {
			valid = true;
		} else {
			valid = false;
		}
		return valid;
		
		
		
		
		
		
		
	}
}
