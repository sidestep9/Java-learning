
public class Cat extends Animal implements Feedable, Soundable {
    
    
    Cat(String species, String name, int age) {
        super(species, name, age);
    }
    
    public void feed() {
        System.out.println(name + " nibbles the fish");
    }
    
    public void sound() {
        System.out.println(name + " goes meow~");
    }
}