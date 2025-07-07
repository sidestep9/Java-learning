package hotel;
import user.Guest;
import utility.MenuUI;
import java.util.concurrent.atomic.AtomicInteger;

public class Booking {
    private MenuUI menu = new MenuUI();
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    
    private final int id;
    private final Guest guest;
    private final Room room;
    private final int nights;
    private BookingStatus status;
    
    public Booking(Guest guest, Room room, int nights) {
        this.id = COUNTER.getAndIncrement();
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.status = BookingStatus.PENDING;
    }
    public Booking(Guest guest, Room room, int nights, BookingStatus status) {
        this.id = COUNTER.getAndIncrement();
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.status = status;
    }
    
    public int getId() {
        return this.id;
    }
    public Guest getGuest() {
        return this.guest;
    }
    public Room getRoom() {
        return this.room;
    }
    public int getNights() {
        return this.nights;
    }
    public BookingStatus getStatus() {
        return this.status;
    }
    
    public void confirm() {
        this.status = BookingStatus.CONFIRMED;
    }
    public void checkIn() {
        this.status = BookingStatus.CHECKED_IN;
    }
    public void complete() {
        this.status = BookingStatus.COMPLETED;
    }
    public void cancel() {
        this.status = BookingStatus.CANCELLED;
    }
    
    public void displayInfo() {
        menu.separator();
        System.out.println("Room ID : " + room.getId());
        System.out.println("Type    : " + room.getType());
        System.out.println("Duration: " + this.nights + " night(s)");
        menu.separator();
    }
    
    
    public String toSave() {
        return this.id + "-" + guest.getUsername() + "-" + room.getId() + "-" + nights + "-" + status;
    }
}