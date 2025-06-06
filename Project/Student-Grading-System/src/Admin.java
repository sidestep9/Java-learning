
public class Admin extends User{
    static int counter = 1;
    
    Admin(String role, String name, int pin) {
        super(role, name, pin);
        this.id = counter++;
    }
    
    public void displayInfo() {
        // nothing
    }
}