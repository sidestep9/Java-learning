import java.util.Scanner;
import java.util.ArrayList;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);
    
    // String stuff
    private static String capitalize(String text) {
        String[] words = text.trim().split("\\s+");
        String first;
        String rest;
        String result = "";
        
        for(String word : words) {
            first = word.substring(0, 1).toUpperCase();
            rest = word.substring(1).toLowerCase();
            result += first + rest + " ";
        }
        
        return result.trim();
    }
    
    public static String inputName(String prompt) {
        String text;
        while(true) {
          System.out.print(prompt);
          text = scanner.nextLine().trim();
          if(text == null || text.isEmpty()) {
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
    public static ArrayList<String> inputTexts(String prompt) {
        ArrayList<String> texts = new ArrayList<>();
        String input;
        
        while(true) {
           input = inputText(prompt).toLowerCase();
           if(input.equals("done")) {
               break;
           }
           if(input.isEmpty()) {
               System.out.println("Input can't be empty");
               continue;
           }
           texts.add(input);
        }
        return texts;
    }
    
    // int stuff
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
            scanner.nextLine();
        }
    }
    
    // float stuff
    public static double inputDouble(String prompt) {
        double num;
        while(true) {
            System.out.print(prompt);
            if(scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                scanner.nextLine();
                return num;
            }
            System.out.println("Must contain only number");
            scanner.nextLine();
        }
    }
}