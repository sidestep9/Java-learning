
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
    
    Room getRoom(int id) {
        for(Room room : hotel.rooms) {
            if(room.roomId == id) {
                return room;
            }
        }
        System.out.println("Room not found");
        return null;
    }
    
    void setPrice(Room room, double price) {
        room.price = price;
        System.out.println("Price updated");
    }
    void setStatus(Room room, String status) {
        if(status.equals("y") || status.equals("yes")) {
            room.isAvailable = true;
        }
        else if(status.equals("n") || status.equals("no")) {
            room.isAvailable = false;
        }
        else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Status changed");
    }
}