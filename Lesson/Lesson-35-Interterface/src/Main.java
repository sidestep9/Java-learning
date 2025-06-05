
public class Main {
    
    public static void main(String[] args) {
        
        // interface = a blueprint for class that specifies abstract methods
        //             that the implementing class MUST define.
        //             supports multiple inheriitance-like behavior
        
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
    
}