import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) {
        // Exception = An event that interrupt normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch(){}, finally{}
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
        }
        catch(InputMismatchException e) {
            System.out.println("THAT'S NOT A NUMBER");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This always executes");
            // auto close scanner in this case
        }
    }
    
}