package user;

public abstract class User {
    private int id;
    private String username;
    private String password;
    
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public int getId() {
        return this.id;
    }
    protected void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    protected String getPassword() {
        return this.password;
    }
    
    public String toString() {
        return this.id + "-" + this.username + "-" + this.password;
    }
}