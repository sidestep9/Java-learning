package data;
import user.Guest;
import user.Staff;
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
}