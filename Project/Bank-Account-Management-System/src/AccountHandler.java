import java.util.ArrayList;

public class AccountHandler {
    
    ArrayList<Account> accounts = new ArrayList<>();
    
    void addAdminTemporary(){
        accounts.add(new Admin("MR.POTATO", "chips9", 123456));
       // System.out.println("Added admin! account size: " + accounts.size());
    }
    void addClientTemporary(){
        accounts.add(new Client("SPONGEBOB", "square1", 123456));
        accounts.add(new Client("PATRICK", "star2", 123456));
        accounts.add(new Client("SQUIDWARD", "tent3", 123456));
    //    System.out.println("Added client! account size: " + accounts.size());
    }
    Account searchClient(String input) {
        for(Account account : accounts) {
            if(account.userName.equals(input) || input.equals(String.valueOf(account.id))) {
                return account;
            }
        }
        return null;
    }
    boolean clientNull(Account client) {
    if(client == null) {
      System.out.println("CLIENT NOT FOUND");
      return true;
    }
    else {
      return false;
    }
  }
    void addClient(Client client) {
        accounts.add(client);
    }
    
}