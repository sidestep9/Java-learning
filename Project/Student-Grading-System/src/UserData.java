import java.util.ArrayList;

public class UserData {
    ArrayList<User> users = new ArrayList<>();
    
    void addUser(String role, String name, int pin){
        if(role.equalsIgnoreCase("teacher")) {
            users.add(new Teacher(role, name, pin));
            System.out.println("New teacher added");
            InputUtil.divider();
        }
        else if(role.equalsIgnoreCase("student")) {
            users.add(new Student(role, name, pin));
            System.out.println("New student added");
            InputUtil.divider();
        }
        else {
            System.out.println("Role doesn't exist");
            InputUtil.divider();
        }
    }
}