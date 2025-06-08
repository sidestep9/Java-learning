
public class StaffLogic {
    Staff staff;
    Hotel hotel;
    
    StaffLogic(Staff staff, Hotel hotel) {
        this.staff = staff;
        this.hotel = hotel;
    }
    
    boolean getCredential(String username, int pin) {
        if(staff.username.equals(username) && staff.pin == pin) {
            return true;
        }
        else {
            return false;
        }
    }
}