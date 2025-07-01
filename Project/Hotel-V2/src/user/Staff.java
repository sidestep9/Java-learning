package user;

public class Staff extends User{
    private static int counter = 11;
    
    public Staff(String username, String password) {
        super(username, password);
        setId(counter++);
    }
    public Staff(int id, String username, String password) {
        super(id, username, password);
        this.counter = id + 1;
    }
    
}