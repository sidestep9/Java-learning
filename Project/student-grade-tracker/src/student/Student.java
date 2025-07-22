package student;
import java.util.List;
import java.util.ArrayList;
import subject.StudentSubject;

public class Student {
    private static int counter = 1001;
    private final int id = counter++;
    private String name;
    private List<StudentSubject> subjects = new ArrayList<>();
    
    public Student(String name) {
        this.name = name;
    }
    
    public List<StudentSubject> getSubjects() {
        return subjects;
    }
    
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}