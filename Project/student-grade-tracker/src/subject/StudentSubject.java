package subject;
import grade.Grade;

public class StudentSubject {
    private Subject subject;
    private int score;
    private Grade grade;
    
    public StudentSubject(Subject subject) {
        this.subject = subject;
        this.score = 0;
        this.grade = Grade.F;
    }
    public StudentSubject(Subject subject, int score) {
        this.subject = subject;
        this.score = score;
        this.grade = Grade.finalScore(score);
    }
    public StudentSubject(Subject subject, int score, Grade grade) {
        this.subject = subject;
        this.score = score;
        this.grade = grade;
    }
    
    public int getScore() {
        return this.score;
    }
    public Grade getGrade() {
        return this.grade;
    }
}