
public class Teacher extends User{
    static int counter = 101;
    String subject = "";
    
    Teacher(String role, String name, int pin) {
        super(role, name, pin);
        id = counter++;
    }
    
    @Override
    void displayInfo(){
        InputUtil.separator();
        System.out.println("Role   : " + role);
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Subject: " + subject);
        InputUtil.separator();
    }
}