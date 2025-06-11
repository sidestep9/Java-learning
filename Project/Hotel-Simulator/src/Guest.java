import java.util.ArrayList;

public class Guest extends User{
    private ArrayList<Room> bookings = new ArrayList<>();
    
    Guest(String username, int pin) {
        super(username, pin);
    }
    
    String getUsername() {
        return username;
    }
    boolean checkPin(int input) {
        return pin == input;
    }
    ArrayList<Room> getBookings() {
        return bookings;
    }
}