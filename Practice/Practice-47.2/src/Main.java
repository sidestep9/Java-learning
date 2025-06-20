import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    
    static ArrayList<Habit> habits = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
        int choice;
        boolean isExit = false;
        
        while(!isExit) {
            System.out.println("\n=== HABIT TRACKER ===");
            
            System.out.println("\n––– List –––");
            for(Habit habit : habits) {
                habit.displayInfo();
            }
            System.out.println("–––");
            
            System.out.println("\n[1] Add habit");
            System.out.println("[2] Remove habit");
            System.out.println("[3] Mark habit");
            System.out.println("[4] Exit");
            
            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    addHabit();
                break;
                case 2:
                    removeHabit();
                break;
                case 3:
                    markDone();
                break;
                case 4:
                   isExit = true; 
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        System.out.println("\nGoodbye and have a nice day");
        scanner.close();
    }
    
    public static void addHabit() {
        String name;
        
        System.out.print("\nEnter habit name: ");
        name = scanner.nextLine().trim();
        
        if(name == null || name.isEmpty()) {
          System.out.println("Name can't be empty");
          return;
        }
        
        habits.add(new Habit(name));
    }
    public static void removeHabit() {
        String name;
        
        System.out.print("Enter habit name: ");
        name = scanner.nextLine().trim();
        
        for(Habit habit : habits) {
            if(habit.getName().equals(name)) {
                habits.remove(habit);
                System.out.println("Removed");
                return;
            }
        }
        
        System.out.println("Not found");
    }
    public static void markDone() {
        String name;
        
        System.out.print("Enter habit name: ");
        name = scanner.nextLine().trim();
        
        for(Habit habit : habits) {
            if(habit.getName().equals(name)) {
                habit.setMark();
                return;
            }
        }
        
        System.out.println("Not found");
    }
    
}