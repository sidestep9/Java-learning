package subject;
import java.util.List;
import java.util.ArrayList;

public class SubjectRepository {
    private List<Subject> subjects = new ArrayList<>();
    
    public void addSubject(String name, String professor) {
        subjects.add(new Subject(name, professor));
    }
    
}
