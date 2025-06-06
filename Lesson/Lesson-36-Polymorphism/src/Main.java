import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // POLYMORPHISM = "POLY" = "MANY"
        //              = "MORPH" = "MANY"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.
        
   /*     Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        
        Vehicle[] vehicles = {car, bike, boat};
        for(Vehicle vehicle : vehicles) {
            vehicle.go();
        } 
    */
    
        // RUNTIME POLYMORPHISM = When the methods that get executed
        //                        at runtime based on the actual type of the object.
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        Vehicle vehicle;
        
        System.out.print("ENTER CHOICE (1 = CAR, 2 = BIKE, 3 = BOAT): ");
        choice = scanner.nextInt();
        switch(choice) {
            case 1:
                vehicle = new Car();
                vehicle.go();
            break;
            case 2:
                vehicle = new Bike();
                vehicle.go();
            break;
            case 3:
                vehicle = new Boat();
                vehicle.go();
            break;
            default:
                System.out.println();
        }
    }
    
}