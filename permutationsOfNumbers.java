public class permutationsOfNumbers { 
   public static void main(String[] args) {
      int list[] = {4, 5, 6, 7, 8}; // set of numbers the program can choose from
      int SetOfDigits = list.length;
      int SomeNum = 3; // print out three of the numbers from the list
      int data[] = new int[SomeNum];
      
      System.out.println("First 20 possibilities with " +SomeNum+ " digits: ");
      printPermutations(list, data, SetOfDigits - 1, 0, SomeNum);
   }
   
   public static void printPermutations(int arr[], int data[], int end, int index, int SomeNum) {
      if (index == SomeNum) {
         for (int i = 0; i < SomeNum; i++) 
         System.out.print(data[i]);
         System.out.println("");
         return ;
      }
         
      for (int k = 0; k <= end && end-k>= SomeNum - index; k++) {
         data[index] = arr[k];
         printPermutations(arr, data, end, index + 1, SomeNum);
      }
      
   }

}