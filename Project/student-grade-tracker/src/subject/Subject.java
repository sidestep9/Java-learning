package subject;

public class Subject {
    private static int counter = 101;
    private final int id = counter++;
    private String name;
    private String professor;
    
    public Subject(String name, String professor) {
        this.name = name;
        this.professor = professor;
    }
    
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProf() {
        return this.professor;
    }
}