
public class Habit {
    private String name;
    private boolean isDone;
    
    public Habit(String name) {
        this.name = name;
        this.isDone = false;
    }
    
    public String getName() {
        return this.name;
    }
    public void setMark() {
        if(isDone == false) {
            this.isDone = true;
        }
        else {
            this.isDone = false;
        }
    }
    
    public void displayInfo() {
        System.out.println((isDone ? "[✓]" : "[X]") + " " + name);
    }
}