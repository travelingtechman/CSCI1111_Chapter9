import java.util.Scanner;
/**
 * 3/2/22
 * @author ethan hunt
 *
 */

public class Exercise6_9 {

	public static void main(String[] args) { 
		double foot = 1.0;
		double meter = 20;
		
		
		double [][] conversions = new double [10][4];
		System.out.println("Feet\tMeters\tMeters\tFeet");
		System.out.println("-----------------------------");
		for(int i = 0; i < 10; i++) {
			
			conversions [i][0] = foot;
			foot++;
			conversions [i][2] = meter;
			meter += 5;
			//System.out.print(conversions[0][i] + "\t");	
			//System.out.print(conversions[2][i]);
			//System.out.println();
		} for(int i = 0; i < 10; i++) {
			conversions[i][1] = footToMeter(conversions[i][0]);
			conversions[i][3] = meterToFoot(conversions[i][2]);
			for(int j = 0; j < 4; j++) {
				System.out.print(conversions[i][j] + "\t"); 		
			}
			System.out.println();
		}
		
	}	
		/** Convert from feet to meters */
		public static double footToMeter(double foot) { 
			double meter = 0.305 * foot;
			return meter;
		}

		/** Convert from meters to feet */
		public static double meterToFoot(double meter) {
			double foot = 3.279 * meter;
			return foot;
		}

	

}
