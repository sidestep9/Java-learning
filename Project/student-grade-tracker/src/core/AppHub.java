package core;
import student.Student;
import student.StudentRepository;
import subject.Subject;

public class AppHub {
    private static StudentRepository studentRepo = new StudentRepository();
    private static SubjectRepository subjectRepo = new SubjectRepository();
    
    public static void registerStudent(String name) {
        studentRepo.registerStudent(name);
    }
    public static Student searchStudent(String target) {
        return studentRepo.searchStudent(target);
    }
}