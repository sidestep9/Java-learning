package user;
import java.util.ArrayList;

public class GuestRepository {
    ArrayList<Guest> guests = new ArrayList<>();
    
    protected boolean validUsername(String username) {
        for(Guest guest : guests) {
            if(guest.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    protected void signup(String username, String password) {
        guests.add(new Guest(username, password));
    }
    protected Guest login(String username, String password) {
        for(Guest guest : guests) {
            if(guest.getUsername().equals(username) && guest.getPassword().equals(password)) {
                return guest;
            }
        }
        return null;
    }
}