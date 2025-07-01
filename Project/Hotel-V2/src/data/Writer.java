package data;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import user.Guest;

public class Writer {
    public void writeGuestAccount(Guest guest) {
        String filePath = "/storage/emulated/0/Java-learning/Project/Hotel-V2/src/data/account/guests.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(guest.toString());
            writer.newLine();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
}