import java.util.Scanner;

public class InputUtil {
    
    static Scanner scanner = new Scanner(System.in);
    
    static String inputLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    static int inputInt(String prompt) {
        int num;
        
        System.out.print(prompt);
        while(true) {
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            System.out.println("MUST CONTAIN ONLY NUMBERS");
        }
    }
}