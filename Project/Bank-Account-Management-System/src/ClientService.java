
public class ClientService {
    
    private AccountHandler accountHandler;
    private Client client;
    
    ClientService(AccountHandler accountHandler) {
      this.accountHandler = accountHandler;
    }
    
    void currentClient(Client client) {
      this.client = client;
    }
    
    boolean sumValid(double sum) {
      if(sum < 0) {
        System.out.println("INVALID AMOUNT");
        return false;
      }
      if(sum > client.balance) {
        System.out.println("INSUFFICIENT BALANCE");
        return false;
      }
      if(sum < 10) {
        System.out.println("MINIMUM TRANSACTION IS 10");
        return false;
      }
      return true;
    }
    boolean transferClientCheck(Client targetClient) {
      if(accountHandler.clientNull(targetClient)) {
        System.out.println("CLIENT NOT FOUND");
        return false;
      }
      if(client == targetClient) {
        System.out.println("INVALID RECIEVER");
        return false;
      }
      return true;
    }
    
    void deposit(double sum) {
      double initialBalance = client.balance;
      
      client.balance += sum;
      client.addRecord("DEPOSIT", initialBalance, sum, client.balance);
      System.out.printf("DEPOSIT: %.2f\n", sum);
    }
    void withdraw(double sum) {
      double initialBalance = client.balance;
      
      if(!sumValid(sum)) return;
      
      client.balance -= sum;
      client.addRecord("WITHDRAW", initialBalance, sum, client.balance);
      System.out.printf("WITHDRAW: %.2f\n", sum);
    }
    void transfer(double sum, Client targetClient) {
      double initialBalance = client.balance;
      double targetInitialBalance = targetClient.balance;
      String confirm;
      
      if(!transferClientCheck(targetClient)) return;
      if(!sumValid(sum)) return;
      
      targetClient.summary();
      InputHandler.lineBreak();
      confirm = InputHandler.inputLine("CONFIRM TRANSFER (Y/N): ");
      InputHandler.lineBreak();
      if(!accountHandler.confirmation(confirm)) return;
      
      client.balance -= sum;
      targetClient.balance += sum;
      client.addRecord("TRANSFER", initialBalance, sum, client.balance);
      targetClient.addRecord("TRANSFER", targetInitialBalance, sum, targetClient.balance);
      System.out.println("TRANSFER SUCCESSFUL");
    }
}