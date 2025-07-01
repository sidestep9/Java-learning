package user;
import java.util.ArrayList;
import hotel.Room;

public class Guest extends User{
    private ArrayList<Room> bookings = new ArrayList<>();
    private static int counter = 101;
    
    public Guest(String username, String password) {
        super(username, password);
        setId(counter++);
    }
    public Guest(int id, String username, String password) {
        super(id, username, password);
        this.counter = id + 1;
    }
    
    protected ArrayList<Room> getBookings() {
        return this.bookings;
    }
    protected void displayBookings() {
        for(Room booking : bookings) {
            booking.displayBookings();
        }
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
}