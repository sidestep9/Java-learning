import java.util.ArrayList;

public class Client extends Account{
				
				ArrayList<Record> records = new ArrayList();
				double balance;
				static int nextClientId = 1001;
				int recordCounter = 1;
				
				Client(String fullName, String userName, int pin) {
								super(fullName, userName, pin);
								this.id = nextClientId++;
				}
				
				void summary() {
				  super.displayInfo();
				}
				@Override
				void displayInfo() {
								super.displayInfo();
								System.out.printf("Balance  : %.2f\n", balance);
				}
				void addRecord(String cause, double initialBalance, double sum, double finalBalance) {
         records.add(new Record(recordCounter++, cause, initialBalance, sum, finalBalance));
        }
				
}