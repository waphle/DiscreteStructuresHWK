class partA_Geo { 
    
	// Geometric formula: x = a*r^(N-1), where:
    // a = the First term, 
    // r = the Common ratio 
    // N = the Nth term
	static void printSeries(int a, int r, int N) { 
        int first_term; 
        
        for (int i = 0; i < N; i++) { 
            first_term = a * (int)Math.pow(r, i); 
            System.out.print(first_term + " + "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
    	// First number
        int a = 7; 
        
        // Common ratio 
        int r = 3; 
        
        // Nth term
        int N = 2;  
        
        // Output
        printSeries(a, r, N); 
    } 
} 