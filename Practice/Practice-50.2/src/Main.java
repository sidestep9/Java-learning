import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String input;
        String[] parts;
        String word;
        Map<String, Integer> frequencies = new HashMap<>();
        
        System.out.print("Enter sentence: ");
        input = scanner.nextLine().trim();
        
        parts = input.split("\\s+");
        
        for(String part : parts) {
            word = part.toLowerCase().trim();
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies: ");
        for(String freq : frequencies.keySet()) {
            System.out.println(freq + ": " + frequencies.get(freq));
        }
        
        System.out.print("Most frequent words: ");
        
        
        scanner.close();
    }
    
}