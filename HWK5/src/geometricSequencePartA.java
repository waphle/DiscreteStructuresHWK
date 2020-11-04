class partA_Geo { 
    
	// Geometric formula: x = a*r^(n-1), where:
    // a = the First term, 
    // r = the Common ratio 
    // n = the Nth term
	static void print_Geo(int a, int r, int n) { 
        int first_term; 
        
        for (int i = 0; i < n; i++) { 
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
        int n = 2;  
        
        // Output
        print_Geo(a, r, n); 
    } 
} 