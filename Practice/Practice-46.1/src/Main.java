import utility.InputHandler;
import utility.MenuUI;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        int numOfTask;
        ArrayList<String> taskName = new ArrayList<>();
        ArrayList<Double> duration = new ArrayList<>();
        
        numOfTask = InputHandler.inputInt("How many tasks: ");
        System.out.println();
        
        while(numOfTask > 0) {
            taskName.add(InputHandler.inputText("Enter task name: "));
            duration.add(InputHandler.inputDouble("How long (minutes): "));
            System.out.println();
            
            numOfTask--;
        }
    }
    
}