import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        Meal meal = null;
        
        System.out.println("Available Meals:");
        for(Meal m : Meal.values()) {
            System.out.println("• " + m);
        }
        
        try {
            System.out.print("\nEnter choice: ");
            choice = scanner.nextLine().toUpperCase().trim();
            meal = Meal.valueOf(choice);
            
            System.out.println("\nMeal       : " + meal.name());
            System.out.println("Time       : " + meal.getTime());
            System.out.println("Calories   : " + meal.getCalories() + " KCAL");
            System.out.println("Meal Number: " + (meal.ordinal() + 1));
        }
        catch(IllegalArgumentException e) {
            System.out.println("\nInvalid choice");
        }
        
    }
    
}