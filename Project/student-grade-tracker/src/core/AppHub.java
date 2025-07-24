package core;
import java.util.ArrayList;
import student.Student;
import student.StudentRepository;
import subject.SubjectRepository;

public class AppHub {
    private static StudentRepository studentRepo = new StudentRepository();
    private static SubjectRepository subjectRepo = new SubjectRepository();
    
    public static void registerStudent(String name) {
        studentRepo.registerStudent(name);
    }
    public static Student searchStudent(String target) {
        return studentRepo.searchStudent(target);
    }
    public static void addSubject(String name, String professor) {
        subjectRepo.addSubject(name, professor);
    }
    public static ArrayList<String> subjectList() {
        return subjectRepo.subjectList();
    }
}