
public class Student extends User{
    static int counter = 1001;
    
    Student(String role, String name, int pin) {
        super(role, name, pin);
        id = counter++;
    }
    
    @Override
    public void displayInfo() {
        InputUtil.separator();
        System.out.println("Role   : " + role);
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Courses: ");
        InputUtil.separator();
    }
}