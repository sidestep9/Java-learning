import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // ENUMS = (Enumeration) A special kind of class
        //         that represents a fixed set of constant.
        //         They improve code readability and reliabilitty.
        //         More efficient with switches rathen than comparing Strings.
        
        Scanner scanner = new Scanner(System.in);
        
        String response;
        
        System.out.print("Enter day: ");
        response = scanner.nextLine().toUpperCase().trim();
        
        try {
            Day day = Day.valueOf(response);
        
            switch(day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("It's a weekday");
                break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's the weekend");
                break;
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println("Pleade enter a correxf day");
        }
        
        scanner.close();
    }
    
}