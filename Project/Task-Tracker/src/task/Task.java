package task;

public class Task {
    private int id;
    private static int counter = 1;
    private String name;
    private String deadline;
    private boolean isDone;
    
    public Task(String name, String deadline, boolean isDone) {
        this.name = name;
        this.deadline = deadline;
        this.isDone = isDone;
        this.id = counter++;
    }
    
    public Task(int id, String name, String deadline, boolean isDone) {
        this.name = name;
        this.deadline = deadline;
        this.isDone = isDone;
        this.id = id;
    }
    
    public String toString() {
        return id + "|" + (isDone ? "[✓]" : "[X]") + "|" + name + "|" + deadline;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public boolean getMark() {
        return isDone;
    }
    public void setMark(boolean isDone) {
        this.isDone = isDone;
    }
    
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
}