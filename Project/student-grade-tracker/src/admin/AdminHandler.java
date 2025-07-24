package admin;
import java.util.List;
import java.util.ArrayList;
import utility.MenuUI;
import utility.InputHandler;
import student.Student;

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
                                      "[3] Add subject",
                                      "[4] Assign subject",
                                      "[9] Exit");
            switch(choice) {
                case 1:
                    registerStudent();
                break;
                case 2:
                    searchStudent();
                break;
                case 3:
                    addSubject();
                break;
                case 4:
                    assignSubject();
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
        Student student;
        
        menuUI.divider();
        target = InputHandler.inputName("Enter ID/name: ");
        student = adminService.searchStudent(target);
        if(student == null) {
            System.out.println("Student not found");
            return;
        }
        student.toString();
    }
    
    private void addSubject() {
        String name;
        String professor;
        
        menuUI.divider();
        name = InputHandler.inputName("Enter subject name: ");
        professor = InputHandler.inputName("Enter professor: ");
        adminService.addSubject(name, professor);
    }
    private void assignSubject() {
        String target;
        Student student;
        List<String> subjectList;
        
        menuUI.divider();
        target = InputHandler.inputName("Enter ID/name: ");
        student = adminService.searchStudent(target);
        if(student == null) {
            System.out.println("Student not found");
            return;
        }
        student.toString();
        
        subjectList = adminService.subjectList();
    }
}