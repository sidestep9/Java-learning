
public abstract class User {
    String role;
    String name;
    int id;
    int pin;
    
    User(String role, String name, int pin) {
        this.role = role;
        this.name = name;
        this.pin = pin;
    }
    
    abstract void displayInfo();
}