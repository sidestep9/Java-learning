package data;
import user.Guest;
import hotel.Room;
import hotel.Booking;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Writer {
    public void writeGuestAccount(ArrayList<Guest> guests) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/account/guests.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Guest guest : guests) {
                writer.write(guest.toString());
                writer.newLine();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    public void writeHotelRoom(ArrayList<Room> rooms) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/hotel/room.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Room room : rooms) {
                writer.write(room.toSave(true));
                writer.newLine();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    public void writeGuestBooking(ArrayList<Booking> bookings) {
        if(bookings == null || bookings.isEmpty()) return;
        
        String fileName = bookings.get(0).getGuest().getId() + "-" + bookings.get(0).getGuest().getUsername() + ".txt";
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/booking/" + fileName;
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Booking booking : bookings) {
                writer.write(booking.toSave());
                writer.newLine();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
}