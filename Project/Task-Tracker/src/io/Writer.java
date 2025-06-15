package io;
import task.Task;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Writer {
    
    public void printNote(ArrayList<Task> tasks) {
        String filePath = "//storage//emulated//0//Java-learning//Project//Task-Tracker//Notes//task.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        } 
    }
}