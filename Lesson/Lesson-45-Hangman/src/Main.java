import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    static String divider = "*".repeat(27);
    static String separator = "-".repeat(27);
    static Random random = new Random();
    
    public static void main(String[] args) {
        String word = "";
        int wrongGuesses = 0;
        char guess;
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        
        word = wordsBank();
        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        
        while(wrongGuesses < 6) {
            System.out.println(divider + "\n");
            System.out.print("Word: ");
            for(char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println("\n" + divider);
            System.out.println("\n" + separator + "\n");
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println(separator);
            
            System.out.print("Enter guess: ");
            guess = scanner.next().toLowerCase().charAt(0);
            System.out.println(separator);
            
            if(word.indexOf(guess) >= 0) {
                System.out.println("Correct guess");
                
                for(int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
            }
            else {
                System.out.println("Incorrect guess");
                wrongGuesses++;
            }
            System.out.println();
            
            if(!wordState.contains('_')) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println(divider);
                System.out.println("YOU WIN!");
                System.out.println("The word is: " + word);
                break;
            }
        }
        
        if(wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println(divider);
            System.out.println("GAME OVER!");
            System.out.println("The word is: " + word);
        }
        
        scanner.close();
    }
    
    static String getHangmanArt(int wrongGuesses) {
        String figure = "";
        switch(wrongGuesses) {
            case 0:
            figure = "---  \n" +
                "  |  \n" +
                "     \n" +
                "     \n" +
                "     \n" +
                "     \n";
            break;
            case 1:
            figure = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                "     \n" +
                "     \n" +
                "     \n";
            break;
            case 2:
            figure = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                "  |  \n" +
                "     \n" +
                "     \n";
            break;
            case 3:
            figure = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                " /|  \n" +
                "     \n" +
                "     \n";
            break;
            case 4:
            figure = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                " /|\\\n" +
                "     \n" +
                "     \n";
            break;
            case 5:
            figure  = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                " /|\\\n" +
                " /   \n" +
                "     \n";
            break;
            case 6:
            figure = "---  \n" +
                "  |  \n" +
                "  o  \n" +
                " /|\\\n" +
                " / \\\n" +
                "     \n";
            break;
            default:
            figure = "";
        }
        return figure;
    }
    
    static String wordsBank() {
        String filePath = "/storage/emulated/0/Java-learning/Lesson/Lesson-45-Hangman/words.txt";
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
        
        if(words != null) {
            word = words.get(random.nextInt(words.size());
        }
        
        return word;
    }
}