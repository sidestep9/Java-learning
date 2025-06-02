
public class Account {
				
				String fullName;
				String userName;
				int pin;
				int id;
				static int nextId = 1001;
				
				
				Account(String fullName, String userName, int pin) {
								this.fullName = fullName;
								this.userName = userName;
								this.pin = pin;
								this.id = nextId++;
				}
				
				void displayInfo() {
								System.out.println("User ID  : " + id);
								System.out.println("Fullname : " + fullName);
				}
}