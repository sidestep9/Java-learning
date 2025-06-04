
public class MenuUtils {
    
    static int showMenu(String title, String prompt, String... options) {
      System.out.println(title);
      System.out.println();
      for(String option : options) {
        System.out.println(option);
      }
      InputHandler.lineBreak();
      return InputHandler.inputInt(prompt);
    }
}