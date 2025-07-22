package student;
import java.util.List;
import java.util.ArrayList;

public class StudentRepository {
    
    private List<Student> students = new ArrayList<>();
    
    public void registerStudent(String name) {
        students.add(new Student(name));
    }
    public Student searchStudent(String target) {
        int id = -1;
        
        try{
            id = Integer.parseInt(target);
        }
        catch(NumberFormatException e){
            
        }
        
        for(Student student : students) {
            if(id == student.getId() || target.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }
}