
public class AdminLogic {
    
    String validRole(String role) {
        if(role == null || role.isEmpty()) {
            System.out.println("Role can't be empty");
            return role;
        }
        if(role.equalsIgnoreCase("teacher") || role.equalsIgnoreCase("student")) {
            return role;
        }
        System.out.println("Role is not available");
        return role;
    }
    
    int validPin(int pin) {
        if(String.valueOf(pin).length() != 6) {
            System.out.println("PIN must be 6-digit");
            return pin;
        }
        return pin;
    }
}