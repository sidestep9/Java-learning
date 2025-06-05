
public class Parrot extends Animal implements Feedable, Soundable {
    
    
    Parrot(String species, String name, int age) {
        super(species, name, age);
    }
    
    public void feed() {
        System.out.println(name + " is eating the seeds");
    }
    
    public void sound() {
        System.out.println(name + " goes \"Welcome~\"");
    }
    
}