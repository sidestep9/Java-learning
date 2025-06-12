
public class Main {
    
    public static void main(String[] args) {
        Car car = new Car("Supra", "Silver", 20000);
        
        car.setColor("Black");
        car.setPrice(-25000);
        
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
    
}