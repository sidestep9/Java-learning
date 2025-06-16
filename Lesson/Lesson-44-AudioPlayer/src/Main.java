import utility.InputHandler;
import utility.MenuUI;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        String filePath = "src/When The Moon's Reaching Star.wav";
        File file = new File(filePath);
        MenuUI menu = new MenuUI();
        
        try(AudioInputStream audioStream = new AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            String response = "";
            
            while(!response.equals("Q")) {
                menu.showMenu1("P = Play",
                               "S = Stop",
                               "R = Reset",
                               "Q = Quit");
                response = InputHandler.inputText("Enter choice: ").toUpperCase().trim();
                
                switch(response) {
                    case "P":
                        clip.start();
                    break;
                    case "S":
                        clip.stop();
                    break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                    break;
                    case "Q":
                        clip.close();
                    break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch(LineUnavailableException e) {
            System.out.println("Unable to access audio source");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }
    }
    
}