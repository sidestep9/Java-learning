package task;
import utility.MenuUI;
import utility.InputHandler;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks;
    MenuUI menu = new MenuUI();
    
    public TaskManager(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    
    public void addTask() {
        String name;
        String deadline;
        
        menu.divider();
        name = InputHandler.inputText("Enter task: ");
        menu.separator();
        deadline = InputHandler.inputText("Enter deadline: ");
        
        System.out.println("\nTask added!");
        tasks.add(new Task(name, deadline, false));
    }
    public void removeTask() {
        Task task = searchTask();
        if(task == null) {
            return;
        }
        tasks.remove(task);
        System.out.println("Task removed");
    }
    public void markDone() {
        Task task = searchTask();
        if(task == null) return;
        if(!task.getMark()) {
            task.setMark(true);
            System.out.println("Task checked");
        }
        else {
            task.setMark(false);
            System.out.println("Task unchecked");
        }
        
    }
    
    public Task searchTask() {
        int num = InputHandler.inputInt("Enter task number: ");
        for(Task task : tasks) {
            if(task.getId() == num) {
                return task;
            }
        }
        System.out.println("Not found");
        return null;
    }
    
    /*public void taskId() {
        int counter = 1;
        for(Task task : tasks) {
            if(task.getId() != counter) {
                task.setId(counter);
                // works, but not what I was hoping for
                // I wanted it to replace the missing number instead of resorting
                // the old one to the first id
            }
            counter++;
        }
    }*/
}