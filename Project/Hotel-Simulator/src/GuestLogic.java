import java.util.ArrayList;

public class GuestLogic {
    ArrayList<Room> bookings = new ArrayList<>();
    MenuUI menuUI = new MenuUI();
    Hotel hotel;
    
    GuestLogic(Hotel hotel) {
        this.hotel = hotel;
    }
    
    void showBooking() {
        if(bookings.isEmpty()) {
            System.out.println("You haven't booked any room");
            return;
        }
        for(Room booking : bookings) {
            menuUI.separator();
            booking.bookInfo();
        }
        menuUI.separator();
    }
    
    void setBooking(int choice, int duration) {
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
    
    void cancelBook(int id) {
        if(bookings.isEmpty()) {
            System.out.println("You haven't booked any room");
            return;
        }
        for(Room booking : bookings) {
            if(booking.roomId == id) {
                bookings.remove(booking);
                System.out.println("Book canceled");
                return;
            }
        }
        System.out.println("Room not found");
    }
}