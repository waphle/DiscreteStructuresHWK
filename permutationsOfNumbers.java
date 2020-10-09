// Initial Commit
public class permutationsOfNumbers { 
   public static void main(String[] args) {
      int list [] = {1, 2, 3, 4, 5}; // set of numbers the program can choose from
      int SetOfDigits = list.length;
      int n = 3; // print out three of the numbers from the list
      int perm = fact(SetOfDigits) / fact(SetOfDigits - n); // Permutation calculation, fact = factorial
      
      System.out.println("Possibilities for numbers with" +n+ "digits: " +perm);
   }
}
