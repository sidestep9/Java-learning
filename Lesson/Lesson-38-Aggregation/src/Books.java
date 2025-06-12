
public class Books {
    String title;
    int pages;
    
    Books(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    void displayInfo() {
        System.out.printf("%s (%d pages)\n", title, pages);
    }
}