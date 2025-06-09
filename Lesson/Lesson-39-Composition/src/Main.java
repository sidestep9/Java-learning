
public class Main {
    
    public static void main(String[] args) {
        // Composition = Represents a "a part-of"  relationship between object
        //               For example, an engine is part of a car.
        //               Allows complex object to be constructed from smaller objects.
        
        Car car = new Car("Supra", 2004, "I-8");
        
        System.out.println(car.model + " " + car.year + " " + car.engine.type);
        car.start();
    }
    
}