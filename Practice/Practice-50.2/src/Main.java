import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String input;
        String[] parts;
        String word;
        HashMap<String, Integer> frequencies = new HashMap<>();
        int counter;
        
        System.out.print("Enter sentence: ");
        input = scanner.nextLine().trim();
        
        parts = input.split("\\s+");
        
        for(String part : parts) {
            word = part.toLowerCase().trim();
            if(frequencies.containsKey(word)) continue;
            counter = 0;
            
            for(String p : parts) {
                if(word.equalsIgnoreCase(p)) {
                    counter++;
                }
            }
            
            frequencies.put(word, counter);
        }
        
        System.out.println("Word frequencies: ");
        for(String freq : frequencies.keySet()) {
            System.out.println(freq + ": " + frequencies.get(freq));
        }
        
        
        scanner.close();
    }
    
}