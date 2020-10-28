import java.util.*;
  
public class equalSet { 
    public static void main(String[] argv) 
    { 
  
        // Create SetA 
        Set<String> SetA = new HashSet<String>(); 
  
        // Numbers in SetA 
        SetA.add("12"); 
        SetA.add("64"); 
        SetA.add("77"); 
        SetA.add("130"); 
        SetA.add("3");
  
        System.out.println("First Set: " + SetA); 
  
        
        // Create SetB
        Set<String> SetB = new HashSet<String>(); 
  
        // Numbers in SetB 
        SetB.add("3"); 
        SetB.add("64"); 
        SetB.add("12"); 
        SetB.add("77"); 
        SetB.add("130"); 
   
        System.out.println("Second Set: " + SetB); 
  
        
        // Compare SetA and SetB
        boolean value = SetA.equals(SetB); 
        
        // Program prints out comparison. Equal = true, Not equal = false.  
        System.out.println("Are both sets equal? "
                           + value); 
    } 
}