// Initial Commit
public class permutationsOfNumbers { 
   public static void main(String[] args) {
      int list [] = {1, 2, 3, 4, 5}; // set of numbers the program can choose from
      int SetOfDigits = list.length;
      int t = 3; // print out three of the numbers from the list
      // int perm = fact(SetOfDigits) / fact(SetOfDigits - t); // Permutation calculation, fact = factorial
      
      // System.out.println("The possibilities for numbers with three digits: " +perm);
      
      int data[] = new int[t];
      
      System.out.println("Here are 20 possibilities: ");
      printPermutations(list, data, SetOfDigits - 1, 0, t);
   }
   
   public static void printPermutations(String[] args) {
      if (index == t) {
         for (int i = 0; i < t; i++) {
            System.out.print(data[i]);
            System.out.println("");
            return;
         }
         
         for (int k = 0; k <= end && end-k + 1 >= t - index; k++) {
            data[index] = arr[i];
            printPermutations(arr, data, end, index+1, t);
         }
   }
   
   public static int fact(int n) {
      int mult = 1;
      for(int j = 1; j < n; j++) {
         mult *= i;
      }
      
      return mult;
   }
}
