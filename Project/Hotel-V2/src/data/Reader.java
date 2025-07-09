package data;
import user.Guest;
import user.Staff;
import hotel.Room;
import hotel.RoomType;
import hotel.Booking;
import hotel.BookingStatus;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
    public void readGuestAccount(ArrayList<Guest> guests) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/account/guests.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\-");
                int id = Integer.parseInt(parts[0]);
                String username = parts[1].trim();
                String password = parts[2].trim();
                
                guests.add(new Guest(id, username, password));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Guest file not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    public void readStaffAccount(ArrayList<Staff> staffs) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/account/staffs.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\-");
                int id = Integer.parseInt(parts[0]);
                String username = parts[1].trim();
                String password = parts[2].trim();
                
                staffs.add(new Staff(id, username, password));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Staff file not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    public void readHotelRoom(ArrayList<Room> rooms) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/hotel/room.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\-");
                int id = Integer.parseInt(parts[0].trim());
                RoomType roomType = RoomType.valueOf(parts[1].trim().toUpperCase());
                boolean isBookable = Boolean.parseBoolean(parts[2].trim());
                
                rooms.add(new Room(id, roomType, isBookable));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Room file not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    public void readGuestBooking(Guest guest,ArrayList<Room> rooms, ArrayList<Booking> bookings) {
        String fileName = guest.getId() + "-" + guest.getUsername() + ".txt";
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/booking/" + fileName;
        Room room;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\-");
                int roomId = Integer.parseInt(parts[2].trim());
                int nights = Integer.parseInt(parts[3].trim());
                BookingStatus status = BookingStatus.valueOf(parts[4].trim());
                
                room = searchRoom(rooms, roomId);
                if(room == null) return;
                bookings.add(new Booking(guest, room, nights, status));
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Room file not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    
    private Room searchRoom(ArrayList<Room> rooms, int id) {
        for(Room room : rooms) {
            if(room.getId() == id) {
                return room;
            }
        }
        System.out.println("\nRoom not found");
        return null;
    }
}