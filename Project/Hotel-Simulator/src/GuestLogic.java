import java.util.ArrayList;

public class GuestLogic {
    MenuUI menuUI = new MenuUI();
    Hotel hotel;
    GuestRepository repo = new GuestRepository();
    
    GuestLogic(Hotel hotel) {
        this.hotel = hotel;
    }
    
    void guestSignup(String username, int pin) {
        if(repo.isUsernameTaken(username)) {
            System.out.println("Username is already taken");
            return;
        }
        if(pin < 100000 || pin > 999999) {
            System.out.println("PIN must be 6-digit");
            return;
        }
        repo.signup(username, pin);
    }
    Guest guestLogin(String username, int pin) {
        return repo.login(username, pin);
    }
    
    void showBooking(Guest guest) {
        ArrayList<Room> bookings = guest.getBookings();
        if(bookings.isEmpty()) {
            menuUI.separator();
            System.out.println("You haven't booked a room");
            menuUI.separator();
            return;
        }
        for(Room booking : bookings) {
            menuUI.separator();
            booking.bookInfo();
        }
        menuUI.separator();
    }
    
    void setBooking(Guest guest, int choice, int duration) {
        ArrayList<Room> bookings = guest.getBookings();
        switch(choice) {
            case 1:
                for(Room room : hotel.rooms) {
                    if(room.type.equalsIgnoreCase("single room") && room.isAvailable == true) {
                        room.isAvailable = false;
                        room.duration = duration;
                        bookings.add(room);
                        System.out.println("Room booked");
                        return;
                    }
                }
            break;
            case 2:
                for(Room room : hotel.rooms) {
                    if(room.type.equalsIgnoreCase("double room") && room.isAvailable == true) {
                        room.isAvailable = false;
                        room.duration = duration;
                        bookings.add(room);
                        System.out.println("Room booked");
                        return;
                    }
                }
            break;
            case 3:
                for(Room room : hotel.rooms) {
                    if(room.type.equalsIgnoreCase("twin room") && room.isAvailable == true) {
                        room.isAvailable = false;
                        room.duration = duration;
                        bookings.add(room);
                        System.out.println("Room booked");
                        return;
                    }
                }
            break;
            case 4:
                for(Room room : hotel.rooms) {
                    if(room.type.equalsIgnoreCase("suite") && room.isAvailable == true) {
                        room.isAvailable = false;
                        room.duration = duration;
                        bookings.add(room);
                        System.out.println("Room booked");
                        return;
                    }
                }
            break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Room unavailable");
    }
    
    void cancelBook(Guest guest, int id) {
        ArrayList<Room> bookings = guest.getBookings();
        if(bookings.isEmpty()) {
            menuUI.separator();
            System.out.println("You haven't booked any room");
            menuUI.separator();
            return;
        }
        for(Room booking : bookings) {
            if(booking.roomId == id) {
                // wanted to add booking.isAvailable = true; but decided not to and let the staff do that instead
                bookings.remove(booking);
                menuUI.separator();
                System.out.println("Book canceled");
                menuUI.separator();
                return;
            }
        }
        menuUI.separator();
        System.out.println("Room not found");
        menuUI.separator();
    } 
}