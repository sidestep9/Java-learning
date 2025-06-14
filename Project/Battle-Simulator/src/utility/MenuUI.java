package utility;

public class MenuUI {
    public void divider() {
        String sym = "*".repeat(29);
        System.out.println(sym);
    }
    public void separator() {
        String sym = "–".repeat(29);
        System.out.println(sym);
    }
    
    public void showMenu(String... options) {
        for(String option : options) {
            System.out.println(option);
        }
    }
    public int showMenuReader(String title, String prompt, String... options) {
        int choice;
        
        System.out.println(title);
        System.out.println();
        for(String option : options) {
            System.out.println(option);
        }
        separator();
        return choice = InputHandler.inputInt(prompt);
    }
    
    public boolean confirmation(String prompt) {
        String input;
        
        input = InputHandler.inputText(prompt).trim().toLowerCase();
        if(input.equals("y") || input.equals("yes")) {
            return true;
        }
        else if(input.equals("n") || input.equals("no")) {
            return false;
        }
        else {
            System.out.println("Invalid input");
            return false;
        }
    }
}