import java.util.ArrayList;

public class CustomerLogic {
    ArrayList<Juice> orders = new ArrayList<>();
    JuiceLogic juiceLogic;
    
    CustomerLogic(JuiceLogic juiceLogic) {
        this.juiceLogic = juiceLogic;
    }
    
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
    
    void showCart(){
        System.out.println("Item: ");
        for(Juice order : orders) {
            System.out.println(order.name);
        }
    }
    
    void checkout() {
        double total = 0;
        System.out.println("Item: ");
        for(Juice order : orders) {
            System.out.println(order.name + " $" + order.price);
            total += order.price;
        }
        System.out.println("Total: $" + total);
    }
}