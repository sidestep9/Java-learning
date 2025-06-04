
public class AdminService {
  
  private AccountHandler accountHandler;
  
  AdminService(AccountHandler accountHandler) {
    this.accountHandler = accountHandler;
  }
  
  boolean userNameValid(String userName){
    if(userName.length() < 6) {
      System.out.println("USERNAME IS TOO SHORT");
      return false;
    }
    else if(userName.length() >12) {
      System.out.println("USERNAME IS TOO LONG");
      return false;
    }
    else if(accountHandler.searchClient(userName) != null) {
      System.out.println("USERNAME ALREADY EXIST");
      return false;
    }
    else {
      return true;
    }
  }
  boolean pinValid(int pin) {
    if(String.valueOf(pin).length() != 6) {
      System.out.println("PIN MUST BE 6-DIGIT");
      return false;
    }
    return true;
  }
  
  void showAllClient() {
    for(Account account : accountHandler.accounts) {
     account.displayInfo();
     System.out.println();
    }
  }
  void showAllTransaction() {
    for(Account account : accountHandler.accounts) {
      if(account instanceof Client) {
        Client client = (Client) account;
        System.out.println(client.fullName);
        System.out.println();
        for(Record record : client.records) {
          record.showRecord();
          System.out.println();
        }
      InputHandler.lineBreak();
      }
    }
  }
  
  void addClient(String fullName, String userName, int pin) {
    accountHandler.accounts.add(new Client(fullName, userName, pin));
  }
  void removeClient(Account client) {
    accountHandler.accounts.remove(client);
    System.out.println("CLIENT REMOVED");
  }
  
  void editFullName(Account client, String newName) {
    client.fullName = newName;
    System.out.println("FULL NAME CHANGED");
  }
  void editUserName(Account client, String newUserName) {
    if(!userNameValid(newUserName)) {
      return;
    }
    client.userName = newUserName;
    System.out.println("USERNAME CHANGED");
  }
  void editPin(Account client, int newPin) {
    if(!pinValid(newPin)) {
      return;
    }
    client.pin = newPin;
    System.out.println("PIN CHANGED");
  }
  void editBalance(Account account, double newBalance) {
    if(newBalance < 0) {
      System.out.println("INVALID AMOUNT");
      return;
    }
    Client client = (Client) account;
    client.balance = newBalance;
    System.out.println("BALANCE CHANGED");
  }
}