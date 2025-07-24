package admin;
import java.util.ArrayList;
import core.AppHub;
import student.Student;

public class AdminService {
    
    protected void registerStudent(String name) {
        AppHub.registerStudent(name);
    }
    protected Student searchStudent(String target) {
        Student student = AppHub.searchStudent(target);
        
        if(student == null) return null;
        
        return student;
    }
    protected void addSubject(String name, String professor) {
        AppHub.addSubject(name, professor);
    }
    protected ArrayList<String> subjectList() {
        return AppHub.subjectList();
    }
}