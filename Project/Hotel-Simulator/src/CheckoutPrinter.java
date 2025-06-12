import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckoutPrinter {
    
    void printCheckout(Guest guest, double total) {
        ArrayList<Room> bookings = guest.getBookings();
        String fileName = "//storage//emulated//0//Java-learning//Project//Hotel-Simulator//receipts//receipt_" + guest.getUsername() + "_" + System.currentTimeMillis() + ".txt";
        
        StringBuilder sb = new StringBuilder();
        for(Room booking : bookings) {
            sb.append(String.format("\nRoom %d: %s, $%.2f per night, for %d days", booking.roomId, booking.type, booking.price, booking.duration));
        }
        String rooms = sb.toString();
        
        String receipt = "=== HOTEL RECEIPT ===\n" +
                         "\nGuest   : " + guest.getUsername() +
                         "\n\nBookings" + 
                         rooms +
                         String.format("\n\nTotal   : %.2f", total) +
                         "\n\nThank you for staying with us!";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(receipt);
            System.out.println("Receipt printed");
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
}