import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    
    public static void main(String[] args) {
        /*
        // How to write files in Java (4 popular options)
        
        // FileWriter = good for small to medium-sized text files. -> ✓ tried
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
        */
        
        // ---
        
        // How to read a file in Java (3 popular options) 
        
        // BufferedReader + FileReader = best for reading text files line-by-line -> ✓ tried
        // FileInputStream = Best for binary files (e.g., audio, images)
        // RandomAccessFile = Best for read/write specific portion of large files
        
        String filePath = "//storage//emulated//0//Java-learning//Lesson//Lesson-43-Write-Read-File//Read.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File read successfully");
            System.out.println();
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }
    
}