class partA { 
	static void printSeries(int a, int d, int n) { 
		// Printing AP by simply adding d to previous term. 
		int first_term; 
		first_term = a; 
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print(first_term + " + "); 
			first_term = first_term + d; 
		} 
	} 
  
	// Driver code 
	public static void main(String[] args) { 
		// starting number 
		int a = 301;  
  
		// Common difference 
		int d = 18;  
  
		// Nth term to be find 
		int n = 12;  
		
		System.out.print("Your series is: ");
		printSeries(a, d, n); 
	} 
} 