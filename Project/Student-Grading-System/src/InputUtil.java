import java.util.Scanner;

public class InputUtil {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void divider() {
        String symbol = "*".repeat(33);
        System.out.println(symbol);
    }
    
    public static void separator() {
        String symbol = "–".repeat(17);
        System.out.println(symbol);
    }
    
    private static String capitalizeName(String name) {
        String first;
        String rest;
        String result = "";
        
        if(name == null || name.isEmpty()) {
            return name;
        }
        
        String[] words = name.trim().split("\\s+");
        
        for(String word : words) {
            if(!word.isEmpty()) {
                first = word.substring(0, 1).toUpperCase();
                rest = word.substring(1).toLowerCase();
                result += first + rest + " ";
            }
        }
        
        return result.trim();
    }
    
    public static String inputLine(String prompt) {
        String input;
        
        System.out.print(prompt);
        input = capitalizeName(scanner.nextLine().trim());
        return input;
    }
    
    public static int inputInt(String prompt) {
        int num;
        
        System.out.print(prompt);
        while(true) {
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            else {
                System.out.println("Must only contain numbers");
                scanner.nextLine();
            }
        }
    }
    
}