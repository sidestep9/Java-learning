
public class MenuUI {
    void divider() {
        String sym = "*".repeat(29);
        System.out.println(sym);
    }
    void separator() {
        String sym = "–".repeat(29);
        System.out.println(sym);
    }
    
    int showMenu(String title, String prompt, String... options) {
        int choice;
        
        System.out.println(title);
        System.out.println();
        for(String option : options) {
            System.out.println(option);
        }
        separator();
        return choice = InputHandler.inputInt(prompt);
    }
}