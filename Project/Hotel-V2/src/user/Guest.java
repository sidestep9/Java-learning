package user;
import java.util.ArrayList;
import hotel.Room;

public class Guest extends User{
    private static int counter = 101;
    
    public Guest(String username, String password) {
        super(username, password);
        setId(counter++);
    }
    public Guest(int id, String username, String password) {
        super(id, username, password);
        this.counter = id + 1;
    }
    
    public void setCounter(int counter) {
        this.counter = counter;
    }
}