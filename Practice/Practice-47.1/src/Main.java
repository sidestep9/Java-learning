import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        TimerTask task;
        String msg;
        int countdown;
        
        System.out.println("Enter message:\n");
        msg = scanner.nextLine().trim();
        
        System.out.print("\nEnter countdown (seconds): ");
        countdown = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\n");
        
        task = new TimerTask() {
            int count = countdown;
            @Override
            public void run() {
                System.out.println(count--);
                
                if(count <= 0) {
                    System.out.println("\n" + msg);
                    timer.cancel();
                }
            }
        };
        
        timer.schedule(task, 0, 1000);
        
        scanner.close();
    }
    
}