
public class Main {
    
    public static void main(String[] args) {
        
        // Abstract = Used to define abstract class and methods.
        //            Abstract is the procces of hiding implementation details
        //            and showing only essential features.
        //            Abstract classes can't be insantiated directly.
        //            Can contain abstract methods (which must be implemented)
        //            Can contain concrete methods (which is inherited)
        
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);
        
        circle.display();
        triangle.display();
        rectangle.display();
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
    
}