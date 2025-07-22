package admin;
import core.AppHub;
import student.Student;

public class AdminService {
    
    protected void registerStudent(String name) {
        AppHub.registerStudent(name);
    }
    protected void searchStudent(String target) {
        Student student = AppHub.searchStudent(target);
        
        if(student == null) {
            System.out.println("Student not found");
            return;
        }
        
        System.out.println(student.toString());
    }
}