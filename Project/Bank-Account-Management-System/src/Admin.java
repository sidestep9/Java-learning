
public class Admin extends Account{
				
				static int nextAdminId = 1;
				
				Admin(String fullName, String userName, int pin) {
								super(fullName, userName, pin);
								this.id = nextAdminId++;
				}
				
				@Override
				void displayInfo() {
								
				}
}