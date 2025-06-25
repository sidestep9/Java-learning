package user;

public class Staff extends User{
    private static int counter = 1;
    
    public Staff(String username, String password) {
        super(username, password);
        setId(counter++);
    }
    
}