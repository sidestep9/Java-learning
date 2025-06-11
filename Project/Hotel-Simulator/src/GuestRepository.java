import java.util.ArrayList;

public class GuestRepository {
    private ArrayList<Guest> guests = new ArrayList<>();
    
    boolean isUsernameTaken(String username) {
        for(Guest guest : guests) {
            if(guest.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    void signup(String username, int pin) {
        guests.add(new Guest(username, pin));
        System.out.println("Guest registered");
    }
    Guest login(String username, int pin) {
        for(Guest guest : guests) {
            if(guest.getUsername().equals(username) && guest.checkPin(pin)) {
                return guest;
            }
        }
        return null;
    }
}