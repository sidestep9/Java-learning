
public abstract class Animal implements Feedable, Soundable{
    
    String species;
    String name;
    int age;
    
    Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
    }
    
    public void feed() {
        
    }
    public void sound() {
        
    }
}