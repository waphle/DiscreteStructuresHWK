class partA_Ari {
	
	// Arithmetic formula: T = a + (N-1)*d where:
	// a = the First number
	// d = the Common difference
	// n = the Nth term
	static void printSeries(int a, int d, int n) { 
		int first_term; 
		first_term = a; 
		
		for (int i = 1; i <= n; i++) {
			System.out.print(first_term + " + "); 
			first_term = first_term + d; 
		} 
	} 
  
	// Driver code 
	public static void main(String[] args) { 
		// First number 
		int a = 301;  
  
		// Common difference 
		int d = 18;  
  
		// Nth term 
		int n = 12;  
		
		System.out.print("Your series is: ");
		printSeries(a, d, n); 
	} 
} 