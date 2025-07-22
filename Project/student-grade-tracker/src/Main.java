
import admin.AdminHandler;
import utility.MenuUI;
import utility.InputHandler;

public class Main {
    
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        AdminHandler adminHandler = new AdminHandler();
        int choice;
        
        while(true) {
            menuUI.divider();
            choice = menuUI.showMenu2("=== STUDENT GRADE TRACKER ===",
                                      "Enter choice: ",
                                      "[1] Admin",
                                      "[5] Exit");
            switch(choice) {
                case 1:
                    adminHandler.menu();
                break;
                case 5:
                    menuUI.divider();
                    System.out.println("Goodbye & have a nice day!");
                    menuUI.divider();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            
        }
        
    }
    
}