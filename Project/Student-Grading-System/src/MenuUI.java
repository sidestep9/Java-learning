
public class MenuUI {
    
    int showMenu(String title, String prompt, String... options) {
        int choice;
        
        System.out.println(title);
        System.out.println();
        for(String option : options) {
            System.out.println(option);
        }
        System.out.println();
        InputUtil.separator();
        return choice = InputUtil.inputInt(prompt);
    }
}