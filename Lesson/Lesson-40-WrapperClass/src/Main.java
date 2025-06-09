
public class Main {
    
    public static void main(String[] args) {
        // Wrapper class = Allows primitive values (int, char, boolean, double)
        //                 to be used as objects. (Wrap them in an object)
        //                 Generally, don't wrap a primitive unless you need an object.
        //                 Allows use of Collections Framework and static utility methods.
        
        // Autoboxing    // BTS
        Integer a = 123; // Integer a = new Integer(a); -> Deprecated
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        
        // Unboxing
        int x = a;
        double y = b;
        //etc
    }
    
}