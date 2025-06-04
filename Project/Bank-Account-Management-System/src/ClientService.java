
public class ClientService {
    
    private AccountHandler accountHandler;
    private Client client;
    int recordCounter = 1;
    
    ClientService(AccountHandler accountHandler) {
      this.accountHandler = accountHandler;
    }
    
    void currentClient(Client client) {
      this.client = client;
    }
    
    void addRecord(String cause, double initialBalance, double sum, double finalBalance) {
      client.records.add(new Record(recordCounter++, cause, initialBalance, sum, finalBalance));
    }
    
    void deposit(double sum) {
      double initialBalance = client.balance;
      
      client.balance += sum;
      addRecord("DEPOSIT", initialBalance, sum, client.balance);
      System.out.printf("DEPOSIT: %.2f\n", sum);
    }
    void withdraw(double sum) {
      double initialBalance = client.balance;
      
      client.balance -= sum;
      addRecord("WITHDRAW", initialBalance, sum, client.balance);
      System.out.printf("WITHDRAW: %.2f\n", sum);
    }
    void transfer(double sum, Client targetClient) {
      double initialBalance = client.balance;
      double targetInitialBalance = targetClient.balance;
      
      client.balance -= sum;
      targetClient.balance += sum;
      addRecord("TRANSFER", initialBalance, sum, client.balance);
      targetClient.records.add(new Record(1, "TRANSFER", targetInitialBalance, sum, targetClient.balance));//how to get the transation number of target....
      System.out.println("TRANSFER SUCCESSFUL");
    }
}