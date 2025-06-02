import java.util.ArrayList;

public class Client extends Account{
				
				ArrayList<Record> records = new ArrayList();
				double saving;
				
				Client(String fullName, String userName, int pin) {
								super(fullName, userName, pin);
				}
				
				@Override
				void displayInfo() {
								super.displayInfo();
								System.out.printf("Balance  : $%.2f\n", saving);
				}
}