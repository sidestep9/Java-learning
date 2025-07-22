package admin;
import utility.MenuUI;
import utility.InputHandler;

public class AdminHandler {
    MenuUI menuUI = new MenuUI();
    AdminService adminService = new AdminService();
    
    public void menu() {
        int choice;
        
        while(true) {
            menuUI.divider();
            choice = menuUI.showMenu2("=== ADMIN MENU ===",
                                      "Enter choice: ",
                                      "[1] Register student",
                                      "[2] Search student",
                                      "[4] Add subject",
                                      "[9] Exit");
            switch(choice) {
                case 1:
                    registerStudent();
                break;
                case 2:
                    searchStudent();
                break;
                case 4:
                    addSubject();
                break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
    
    private void registerStudent() {
        String name;
        
        menuUI.divider();
        name = InputHandler.inputName("Enter name: ");
        adminService.registerStudent(name);
    }
    private void searchStudent() {
        String target;
        
        menuUI.divider();
        target = InputHandler.inputName("Enter ID/name: ");
        adminService.searchStudent(target);
    }
    
    private void addSubject() {
        String name;
        String professor;
    }
}