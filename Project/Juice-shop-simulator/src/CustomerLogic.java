import java.util.ArrayList;

public class CustomerLogic {
    JuiceLogic juiceLogic = new JuiceLogic();
    ArrayList<Juice> orders = new ArrayList<>();
    
    void addItem(String target) {
        Juice juice;
        juice = juiceLogic.searchJuice(target);
        if(juice == null) {
            System.out.println("Item not found");
            return;
        }
        orders.add(juice);
        System.out.println("Item added");
    }
    void removeItem(String target) {
        Juice juice;
        juice = juiceLogic.searchJuice(target);
        if(juice == null) {
            System.out.println("Item not found");
            return;
        }
        orders.remove(juice);
        System.out.println("Item removed");
    }
}