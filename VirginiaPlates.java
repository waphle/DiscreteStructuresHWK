import java.util.Random;

public class VirginiaPlates {
    static Random random = new Random();

    public static char createChar() { // Randomize char from 26 letters in the alphabet
        return (char)(random.nextInt(26) + 'A');
    }

    public static int createDigit() { // Randomize digit from 0 to 9
        return random.nextInt(10);
    }

    public static String createPlate() { // Format of CharCharChar-DigitDigitDigitDigit
        return "" + createChar() + createChar() + createChar() + "-" 
        + createDigit() + createDigit() + createDigit() + createDigit();
    }

    public static void main(String[] args) { // Print 20 examples
        for (int i = 0; i < 20; i++) { 
            System.out.println(createPlate());
        }
    }
}