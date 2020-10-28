import java.util.List;
import java.util.Arrays;

// Eclipse -> run configurations -> Arguments -> Input 5 digits
// from 0 to 9 with a comma. Then space and input "3" (no quotation marks)
// and space again and input "20" (no quotation marks). -> Apply and Run.
// Ex. 4,5,6,7,8 3 20

public class PermutationofNumbers {

	public PermutationofNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	static int iterNum = 0;
	
	public static void main(String[] args) {
		
		// Get number set from input
		List<String> numbers = Arrays.asList(args[0].split(","));
		int numberSet[] = new int[numbers.size()];
		int i = 0;
		for (String num: numbers) {
			numberSet[i] = Integer.parseInt(num);
			i++;
		}
		int setSize = numberSet.length;
		
		// Get number of digits from input
		int nDigits = Integer.parseInt(args[1]);
		int data[] = new int[nDigits];
		
		// Get number of the permuted numbers to print
		int nNumbersToPrint = Integer.parseInt(args[2]);
		
		System.out.printf("First %d possibilities with %d digits: \n", nNumbersToPrint, nDigits);
		
		printPermutations(numberSet, data, setSize, 0, nDigits, nNumbersToPrint);
   }
   
   public static void printPermutations(int set[], int data[], int end, int index, int nDigs, int nPrnt) {
	   if (index == nDigs && iterNum < nPrnt) {
		   for (int i = 0; i < nDigs; i++) {
			   System.out.print(data[i]);
		   }
		   System.out.println("");
		   iterNum++;
		   return;
	   }
       
	   for (int k = 0; k < end && nDigs > index; k++) {
		   data[index] = set[k];
		   printPermutations(set, data, end, index + 1, nDigs, nPrnt);
	   }  
   }
}