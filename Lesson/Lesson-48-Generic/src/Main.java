
public class Main {
    
    public static void main(String[] args) {
        // GENERICS = A concept where you cab write class, interface, method
        //            that is compatible with different data types.
        //            <T> type parameters (placeholder that get replaced with a real data type)
        //            <String> type arguments (specificifies data types)
        
        Box<String> box = new Box<>();
        Product<String, Double> product = new Product<>("Pineapple", 3.99);
        
        box.setItem("Potato");
        
        System.out.println(box.getItem());
        System.out.println(product);
    }
    
}