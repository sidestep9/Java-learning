
public class Dog extends Animal implements Feedable, Soundable {
    
    
    Dog(String species, String name, int age) {
        super(species, name, age);
    }
    
    public void feed() {
        System.out.println(name + " chew on the steak");
    }
    
    public void sound() {
        System.out.println(name + " goes woof~");
    }
    
}