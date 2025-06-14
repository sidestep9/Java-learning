import utility.MenuUI;
import utility.InputHandler;
import task.TaskManager;
import task.Task;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        MenuUI menuUI = new MenuUI();
        TaskManager taskManager = new TaskManager(tasks);
        boolean isExit = false;
        int choice;
        
        do {
            menuUI.divider();
            System.out.println("=== TASK TRACKER ===");
            menuUI.divider();
            System.out.println("Task list\n");
            for(Task task : tasks) {
                System.out.println(task);
            }
            menuUI.divider();
            choice = menuUI.showMenu3("Enter choice: ",
                                      "[1] Add task",
                                      "[2] Remove task",
                                      "[3] Mark done",
                                      "[4] Exit");
            switch(choice) {
                case 1:
                    taskManager.addTask();
                break;
                case 2:
                    taskManager.removeTask();
                break;
                case 3:
                    taskManager.markDone();
                break;
                case 4:
                    isExit = true;
                break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(!isExit);
    }
    
}