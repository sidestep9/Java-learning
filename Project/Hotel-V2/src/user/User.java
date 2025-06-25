package user;

public abstract class User {
    private int id;
    private String username;
    private String password;
    
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    protected void setId(int id) {
        this.id = id;
    }
    protected String getUsername() {
        return this.username;
    }
    protected String getPassword() {
        return this.password;
    }
}