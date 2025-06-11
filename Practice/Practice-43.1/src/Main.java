import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        boolean isExit = false;
        
        do {
            System.out.println("=== NOTE SAVER ===" +
                               "\n" +
                               "\n[1] Write a new note" +
                               "\n[2] Read all notes" +
                               "\n[3] Exit");
            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    writeNote();
                break;
                case 2:
                    readNote();
                break;
                case 3:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
        
        System.out.println("\nGoodbye and have a nice day");
        
        scanner.close();
    }
    
    static void writeNote() {
        String input;
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            System.out.println("Enter you notes: ");
            input = scanner.nextLine().trim();
            writer.write(input + "\n");
            System.out.println("Note saved");
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong...");
        }
    }
    
    static void readNote() {
        String filePath = "/storage/emulated/0/Java-learning/Practice/Practice-43.1/notes.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isEmpty = true;
            
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }
            if(isEmpty) {
                System.out.println("No notes found");
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Files does not exist");
        }
        catch(IOException e) {
            System.out.println("Something went wrong...");
        }
    }
}