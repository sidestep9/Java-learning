package io;
import task.Task;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
    public void readNote(ArrayList<Task> tasks) {
        String filePath = "//storage//emulated//0//Java-learning//Project//Task-Tracker//Notes//task.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                boolean isDone = parts[1].equals("[✓]") || parts[1].equals("[X]");
                String name = parts[2].trim();
                String deadline = parts[3].trim();
                
                tasks.add(new Task(id, name, deadline, isDone));
                tasks.get(0).setCounter(id + 1);
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