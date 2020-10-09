public class permutationsOfNumbers { 
   public static void main(String[] args) {
      int list[] = {2, 3, 4, 5, 6}; // set of numbers the program can choose from
      int SetOfDigits = list.length;
      int SomeNum = 3; // print out three of the numbers from the list
      int data[] = new int[SomeNum];
      
      System.out.println("Some possibilities with " +SomeNum+ " digits: ");
      printPermutations(list, data, SetOfDigits - 1, 0, SomeNum);
   }
   
   public static void printPermutations(int arr[], int data[], int end, int index, int SomeNum) {
      if (index == SomeNum) {
         for (int i = 0; i < SomeNum; i++)
         System.out.print(data[i]);
         System.out.println(""); // Line break with each permutation output
         return;
      }   
        
      for (int k = 0; k <= end && end-k >= SomeNum - index; k++) {
         data[index] = arr[k];
         printPermutations(arr, data, end, index + 1, SomeNum);
      }
      
      
   }
}
   
   // public static void printPermutations(int arr[], int data[], int end, int index, int t) {
//       if (index == t) {
//          for (int i = 0; i < t; i++)
//          System.out.print(data[i]);
//          System.out.println("");
//          return;
//       }
//          
//       for (int k = 0; k <= end && end-k >= t - index; k++) {
//          data[index] = arr[k];
//          printPermutations(arr, data, end, index + 1, t);
//       }
//       
//    }
// }