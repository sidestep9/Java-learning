import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

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
        
        System.out.println("\nWord frequencies:");
        
        ArrayList<String> words = new ArrayList<>();
        int total;
        int total2 = 0;
        String mostWord = "";
        for(String part : parts) {
            if(words.contains(part)) continue;
            
            total = 0;
            
            for(String p : parts) {
                if(p.equals(part)) total++;
            }
            
            if(total2 < total) {
                total2 = total;
                mostWord = part;
            }
            else if(total2 == total) {
                mostWord += ", " + part;
            }
            
            System.out.println(part + " -> " + total);
            words.add(part);
        }
        
        System.out.println("\nMost frequent word: " + mostWord);
    }
    
}