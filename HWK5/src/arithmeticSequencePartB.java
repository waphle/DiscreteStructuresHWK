import java.io.*; 
import java.lang.*; 
  
class partB_Ari { 
    public static int Nth_of_AP(int a, int d, int l) 
    {  
        // Formula to find how many terms are in the sequence
        return ((l/d) - (a/d) + 1); 
    } 
    
    static void printSeries(int a, int d, int N) { 
		// Print out all series. 
		int first_term; 
		first_term = a; 
		
		for (int i = 1; i <= N; i++) {
			
			System.out.print(first_term + " + "); 
			first_term = first_term + d; 
		} 
	} 
  
    // Driver code 
    public static void main(String[] args)  
    {  
        // Set the first number 
        int a = 76;  
          
        // Set the common difference 
        int d = 7;  
          
        // Set the last number 
        int l = 160;
        
        // The Nth term of the sequence
        int N = Nth_of_AP(a, d, l);
  
        // Display the output 
        System.out.print("The last number, " + l + ", is the " + Nth_of_AP(a, d, l) + "th term. "); 
        
        System.out.print("Your series is: ");
		printSeries(a, d, N); 
    } 
} 