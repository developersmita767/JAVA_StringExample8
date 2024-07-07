//Write a program to find how many time a given character is repeated in a given string.
//Input: Hello ,l output=2
import java.util.Scanner;

public class StringExample8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string and character from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("Enter a character:");
        char targetChar = scanner.next().charAt(0);

        // Find the frequency of the character in the string
        int frequency = findCharacterFrequency(inputString, targetChar);

        // Output the result
        System.out.println("Frequency of '" + targetChar + "' in the string: " + frequency);

        scanner.close();
    }

    // Method to find the frequency of a character in a string
    public static int findCharacterFrequency(String str, char target) {
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                frequency++;
            }
        }
        return frequency;
    }
}

