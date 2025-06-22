import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        
        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine().toLowerCase().trim();
        
        System.out.println(sentence);
        
        scanner.close();
    }
    
}