import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);
    
    static int inputInt(String prompt) {
        int num;
        while(true) {
            System.out.print(prompt);
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            else {
                System.out.println("MUST CONTAIN ONLY NUMBER");
                scanner.nextLine();
            }
        }
    }
    
    static String inputLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    static void lineBreak() {
        String lineBreak = "*".repeat(29);
        System.out.println(lineBreak);
    }
    
    static void closeScanner() {
        scanner.close();
    }
}