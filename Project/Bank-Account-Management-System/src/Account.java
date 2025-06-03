
public class Account {
				
				String fullName;
				String userName;
				int pin;
				int id;
				
				
				Account(String fullName, String userName, int pin) {
								this.fullName = fullName;
								this.userName = userName;
								this.pin = pin;
				}
				
				void displayInfo() {
								System.out.println("User ID  : " + id);
								System.out.println("Fullname : " + fullName);
				}
}