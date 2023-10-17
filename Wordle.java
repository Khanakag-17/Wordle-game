package Projects;

//Importing required classes and functions
import java.util.*;
import java.io.*;

class game {

    //Initializing Variables
    String userInput;
    String computerWord;
    ArrayList<String> arr = new ArrayList<>();
    ArrayList<String> dict = new ArrayList<>();
    int noOfGuess = 6;

    //Method 1 - Importing and storing in an arraylist (NO RETURN VALUE NEEDED)
    void array_list() {
        Random random = new Random();
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Aashman\\Documents\\College Shitzzz\\Git\\Wordle-game\\Words.txt"));
            while (sc.hasNext()) {
                String data = sc.next();
                arr.add(data.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int a = random.nextInt(arr.size());
        this.computerWord = arr.get(a);
    }

    //Method 2 - To add 5 letter dictionary words in dict
    void validWords() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Aashman\\Documents\\College Shitzzz\\Git\\Wordle-game\\engDict.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (word.length() == 5) {
                    dict.add(word.toUpperCase());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    //Method 3 - Taking user input string (NO RETURN VALUE NEEDED)
    void takeUserInput() {
        boolean c = true;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nGuess the word: ");
            String a = sc.next();
            a = a.toUpperCase();
            for (String element : dict) {
                if (Objects.equals(a, element)) {
                    c = false;
                    this.userInput = a;
                    break;
                }
            }
        }
        if (c) {
            System.out.println("INVALID");
            this.userInput = null;
        }
    }

    //Method 4 - To check the letters in the Input word.
    void correctGuess() {
        for (int i = 0; i < 5; i++) {
            if (computerWord.charAt(i) == userInput.charAt(i)) {
                System.out.print("R ");
            } else {
                boolean b = false;
                for (int j = 0; j < 5; j++) {
                    if (userInput.charAt(i) == computerWord.charAt(j)) {
                        System.out.print("P ");
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    System.out.print("N ");
                }
            }
        }
    }
}


/*HINTS -
1)
*/


//Main method - To call all the methods in the above class.
public class Wordle {
    public static void main(String[] args){
        System.out.println("!!!!WORDLE!!!!");
        game gm = new game();
        gm.array_list();
        gm.validWords();
        int i = 0;
        while(i < gm.noOfGuess){
            gm.takeUserInput();
            if(gm.userInput == null){
                continue;
            }
            gm.correctGuess();
            i++;
            if(Objects.equals(gm.userInput, gm.computerWord)){
                System.out.println("\nYOU WON!!!");
                break;
            }
        }
        System.out.println(" ");
        if(!Objects.equals(gm.userInput, gm.computerWord)){
            System.out.println("\nYOU LOST :(");
        }
        System.out.println("The word was: " + gm.computerWord);
    }
}