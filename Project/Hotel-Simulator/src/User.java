
public abstract class User {
    protected String username;
    protected int pin;
    
    User(String username, int pin) {
        this.username = username;
        this.pin = pin;
    }
}