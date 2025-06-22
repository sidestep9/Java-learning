import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        HashMap<String, Integer> map = new HashMap<>();
        
        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine().toLowerCase().trim();
        
        String[] words = sentence.split("\\s+");
        for(String key : words) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for(String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        scanner.close();
    }
    
}