package user;
import java.util.ArrayList;
import data.Writer;
import data.Reader;

public class StaffRepository {
    ArrayList<Staff> staffs = new ArrayList<>();
    Writer writer = new Writer();
    Reader reader = new Reader();
    
    protected void staffAccount() {
        reader.readStaffAccount(staffs);
    }
    
    protected Staff login(String username, String password) {
        for(Staff staff : staffs) {
            if(staff.getUsername().equals(username) && staff.getPassword().equals(password)) {
                return staff;
            }
        }
        return null;
    }
}