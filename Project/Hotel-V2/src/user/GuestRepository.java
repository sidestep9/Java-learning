package user;
import java.util.ArrayList;
import data.Writer;
import data.Reader;

public class GuestRepository {
    ArrayList<Guest> guests = new ArrayList<>();
    Writer writer = new Writer();
    Reader reader = new Reader();
    
    protected void readGuestAccount() {
        reader.readGuestAccount(guests);
    }
    protected void writeGuestAccount() {
        writer.writeGuestAccount(guests); 
    }
    
    protected boolean validUsername(String username) {
        for(Guest guest : guests) {
            if(guest.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    protected void signup(String username, String password) {
        Guest guest = new Guest(username, password);
        guests.add(guest);
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