import utility.InputHandler;
import utility.MenuUI;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        int numOfTask;
        ArrayList<String> taskName = new ArrayList<>();
        ArrayList<Integer> duration = new ArrayList<>();
        int hours;
        int minutes;
        int total = 0;
        String longest = "";
        int max = 0;
        
        numOfTask = InputHandler.inputInt("How many tasks: ");
        System.out.println();
        
        while(numOfTask > 0) {
            taskName.add(InputHandler.inputText("Enter task name: "));
            duration.add(InputHandler.inputInt("How long (minutes): "));
            System.out.println();
            
            numOfTask--;
        }
        
        System.out.println("=== Daily Task Summary ===\n");
        
        for(int i = 0; i < taskName.size(); i++) {
            hours = duration.get(i) / 60;
            minutes = duration.get(i) % 60;
            total += duration.get(i);
            
            if(i == 0) {
                longest = taskName.get(i);
                max = duration.get(i);
            }
            if(i != 0 && duration.get(i) == max) {
                longest += ", " + taskName.get(i);
            }
            if(i != 0 && duration.get(i) > max) {
                longest = taskName.get(i);
                max = duration.get(i);
            }
            
            
            System.out.printf("%d. %s - %d hours %d minutes\n", i + 1, taskName.get(i), hours, minutes);
        }
        
        System.out.printf("\nTotal time: %d hours %d minutes\n", total / 60, total % 60);
        System.out.println("Longest task(s): " + longest);
    }
    
}