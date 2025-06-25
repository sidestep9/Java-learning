package user;
import java.util.ArrayList;
import hotel.Room;

public class Guest extends User{
    private ArrayList<Room> bookings = new ArrayList<>();
    private int counter = 101;
    
    Guest(String username, String password) {
        super(username, password);
        setId(counter++);
    }
    
    protected ArrayList<Room> getBookings() {
        return this.bookings;
    }
    protected void displayBookings() {
        for(Room booking : bookings) {
            booking.displayBookings();
        }
    }
}