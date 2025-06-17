import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String sentence;
        String reversed = "";
        String longest = "";
        
        System.out.print("Enter word: ");
        sentence = scanner.nextLine().toLowerCase().trim();
        
        String[] parts = sentence.split("\\s+");
        for(int i = parts.length - 1; i >= 0; i--) {
            reversed += parts[i] + " ";
            if(longest.length() < parts[i].length()) {
                longest = parts[i];
            }
        }
        
        System.out.println("\nSentence    : " + sentence);
        System.out.println("Word Count  : " + parts.length);
        System.out.println("Reversed    : " + reversed);
        System.out.println("Longest word: " + longest);
    }
    
}