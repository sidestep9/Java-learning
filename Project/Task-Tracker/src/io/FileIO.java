package io;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    String filePath = "//storage//emulated//0//Java-learning//Project//Task-Tracker//Notes//task.txt";
    
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
        
    }
    catch(FileNotFoundException e) {
        System.out.println("File not found");
    }
    catch(IOException e) {
        System.out.println("Something went wrong");
    }
    
    public String input() {
        
    }
}