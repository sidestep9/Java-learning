import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        // How to write files in Java (4 popular options)
        
        // FileWriter = good for small to medium-sized text files.
        // BufferedWriter = Better performance for large amounts of text.
        // PrintWriter = Best for structured data, like reports or logs.
        // FileOutputStream = Best for binary files (e.g., images, audio files)
        
        String filePath = "text.txt";
        String textContent = "I like cheese";
        
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File is written");
        }
        catch(FileNotFoundException e) {
            System.out.println("Cannot find file");
        }
        catch(IOException e) {
            System.out.println("Could not write this file");
        }
    }
    
}