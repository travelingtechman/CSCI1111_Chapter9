import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
			String s = scan.nextLine();
			
			System.out.println("'" + s + "'" + "is " + s.length() + " characters long");
			System.out.println("There are " + countLetters(s) + " Letters in " + s);

	}
	public static int countLetters(String s) {
		int length = s.length();
		int ledda = 0;
		String[] letters = new String [length];
		String space = " ";
		int upperSubStr = 1;
		
		for(int count = 0; count < length; count++) {
			//System.out.println(s.substring(count,upperSubStr++));
			 letters[count] = s.substring(count, upperSubStr++);
			 String upper = letters[count].toUpperCase();
			 String lower = upper.toLowerCase();
			 String compare = lower.toUpperCase();
			
			 
			 //System.out.println(letters[count]);
			 if(compare != lower ) {
				 ledda ++;
				
			 }
			 
			 //System.out.println("Element No" + count + ": " + s.substring(count));

		  
            
        } 
		int sum = ledda;
		
		
		//String upper = s.toUpperCase();
		//String lower = s.toLowerCase();
		
		
		/*if(compare.charAt(count) == ' ' ) {
			 ledda--;
		 } */
		return sum;
	}
}
