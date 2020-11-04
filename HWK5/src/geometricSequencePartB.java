import java.lang.Math; 
  
class partB_Geo { 
	
	// Find the Nth number:
	
	// Derived from the Geometric formula, we can 
	// find how many numbers are in the sequence.
	// The new formula is N = (ln(x/a) / ln(r)) + 1.
	// I used -Math.log for ln.
	// Let r = common ratio, x = the last number, and a = the first number
    public static int Nth_of_Geo(int r, int x, int a) {  
        return (int) ((-Math.log(x/a))/(-Math.log(r)) + 1);
    } 
    
    
    // Print out all series, same as part A.
    static void printSeries(int a, int r, int N) { 
        int first_number; 
        
        for (int i = 0; i < N; i++) { 
            first_number = a * (int)Math.pow(r, i); 
            System.out.print(first_number + " + "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
    	// First number
        int a = 12; 
        
        // Common ratio 
        int r = 6; 
        
        // Last number
        int x = 15552;
        
        // Nth number
        int N = Nth_of_Geo(r, x, a);  
        
        // Output
        System.out.print("The last number, " + x + ", is the " + Nth_of_Geo(r, x, a) + "th number of the sequence. ");
        System.out.print("Your series is: ");
        printSeries(a, r, N); 
    } 
} 