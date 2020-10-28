public class duplicates
{ 
    boolean areDuplicates(int setA[], int setB[]) { 
        for (int i = 0; i < setA.length; i++) { 
            for (int j = 0; j < setB.length; j++) { 
                if (setA[i] == setB[j]) {
                	return false;
                } 
            } 
        } 
        return true; 
    } 
      
    public static void main(String[] args) { 
    	duplicates dupe = new duplicates(); 
        int setA[] = { 12, 20, 66, 79, 10 }; 
        int setB[] = { 20, 12, 79, 66, 10 }; 
  
        boolean result = dupe.areDuplicates(setA, setB); 
        if (result) 
            System.out.println("No duplicates number(s)."); 
        else
            System.out.println("Has duplicates number(s)."); 
    } 
} 