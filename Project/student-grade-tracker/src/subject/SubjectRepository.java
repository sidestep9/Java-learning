package subject;
import java.util.List;
import java.util.ArrayList;

public class SubjectRepository {
    private List<Subject> subjects = new ArrayList<>();
    
    public void addSubject(String name, String professor) {
        if(sameSubject(name)) {
            System.out.println("Subject already exist");
            return;
        }
        subjects.add(new Subject(name, professor));
    }
    private boolean sameSubject(String name) {
        for(Subject subject : subjects) {
            if(subject.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<String> subjectList() {
        ArrayList<String> subjectList = new ArrayList<>();
        
        if(subjects == null || subjects.isEmpty()) {
            return null;
        }
        
        for(Subject subject : subjects) {
            subjectList.add(subject.getName());
        }
        
        return subjectList;
    }
}
