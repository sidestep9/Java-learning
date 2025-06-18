import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args) {
        // HOW TO WORK USING DATES AND TIMES IN JAVA
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        
        // current date
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        // current time
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        // current date & time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        // utc timestap
        Instant instant = Instant.now();
        System.out.println(instant);
        
        // custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy & HH-mm-ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);
        
        // comparing dates & times
        LocalDateTime dateTime1 = LocalDateTime.of(2025, 9, 18, 2, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 7, 15, 22, 0, 0);
        
        if(dateTime1.isBefore(dateTime2)) {
            System.out.println("My bday is earlier: " + dateTime1);
        }
        else if(dateTime1.isAfter(dateTime2)) {
            System.out.println("Your bday is earlier: " + dateTime2);
        }
        else if(dateTime1.isEqual(dateTime2)) {
            System.out.println("Our bday is at the same date: " + dateTime1 + " " + dateTime2);
        }
    }
    
}