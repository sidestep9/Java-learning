import java.util.Timer;
import java.util.TimerTask;

public class Main {
    
    public static void main(String[] args) {
        
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time use (TimerTask, Runnable, Callbacks)
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat() {
            @Override
            public void speak() {
                System.out.println("The cat says *FEED ME HOOMAN*");
            }
        };
        
        cat1.speak();
        cat2.speak();
        
        //-----------
        System.out.println("\n\n");
        
        // Timer = Class that schedule tasks at a specific time or periodically.
        //         Useful for sending notifications, scheduled updates, repetitive actions
        
        // TimerTask = Represent the task that will be executed by the Timer.
        //             You will extend the timer task class to define your task.
        //             Create a subclass of TimerTask and @Override run()
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println(count--);
                if(count <= 0) {
                    System.out.println("Missile launched.");
                    timer.cancel();
                }
            }
        };
        
        System.out.println("Launching in...");
        timer.schedule(task, 0, 1000); //(task, delay, period)
        
    }
    
}