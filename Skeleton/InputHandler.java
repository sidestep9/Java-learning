import java.util.Scanner;

public class InputHandler {
    private final Static Scanner scanner = new Scanner(System.in);
    
    private static String capitalize(String text) {
        String[] words = text.trim().split("\\s+");
        String first;
        String rest;
        String result = "";
        
        for(String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1).toLowerCase();
            result = first + rest + " ";
        }
        
        return result.trim();
    }
    
    public static String inputName(String prompt) {
        String text;
        while(true) {
          System.out.print(prompt);
          text = scanner.nextLine().trim();
          if(text.isEmpty() || text == null) {
              System.out.println("Name cannot be empty");
              continue;
          }
          return capitalize(text);
        }
    }
    public static String inputText(String prompt) {
        String text;
        System.out.print(prompt);
        text = scanner.nextLine().trim();
        return text;
    }
    
    public static int inputInt(String prompt) {
        int num;
        while(true) {
            System.out.print(prompt);
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            System.out.println("Must contain only numbers");
        }
    }
}