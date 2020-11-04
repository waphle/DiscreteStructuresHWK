import java.util.Scanner;

public class infiniteGeometric {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum;

		// Read inputs
		System.out.println("Enter the first number: ");
		double first = scan.nextDouble();
		
		System.out.println("Enter the ratio: ");
		double ratio = scan.nextDouble();
		
		System.out.println("Enter the number of terms: ");
		int term = scan.nextInt();
  
		// If the ratio is greater than 1, there is no sum for the geometric sequence
		if (ratio >= 1) {
			System.out.println("The infinite sequence does not have a sum.");
		}
			
		// If the ratio is less than 1, there is a sum. Calculate the sum and print. 
		else {
			sum=first/(1-ratio);
			
			System.out.println("The infinite sequence has sum of " + sum);
		}
  
	}
  
}