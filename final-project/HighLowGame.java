import java.util.Scanner;

//this version goes through Step 8 of the project
public class HighLowGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void printInstrutions() {
        System.out.println("***************************************");
        System.out.println("*   Welcome to the High Low Game!     *");
        System.out.println("*   A card will be drawn randomly     *");
        System.out.println("*   from a standard 52 card deck and  *");
        System.out.println("*   you have to try to predict if     *");
        System.out.println("*   the next card drawn at random     *");
        System.out.println("*   will be higher or lower.          *");
        System.out.println("*                                     *");
        System.out.println("*   The card order (low to high):     *");
        System.out.println("*   2 3 . . . 10 J Q K A              *");
        System.out.println("*   and ties are broken by            *");
        System.out.println("*   clubs, diamonds, hearts, spades   *");
        System.out.println("*                                     *");
        System.out.println("*   Enter 'h' for higher              *");
        System.out.println("*   Enter 'l' for lower               *");
        System.out.println("***************************************");
    }

    public static void playGame() {
        CardDeck deck = new CardDeck();

        Scanner myscanner = new Scanner(System.in); // use myscanner.next() to get user input

        printInstrutions();

        // start the game by drawing a card at random and printing it to the terminal
        // System.out.println("Drawing a card at random . . . ");
        // write code here

        // get player's guess using myscanner
        // System.out.println("Will the next randomly drawn card be higher (h) or lower (l)?");
        // write code here

        // draw next card at random and print it to the terminal
        // System.out.println("Drawing a card at random . . . ");
        // write code here

        // decide if player guessed correctly
        // write code here

        myscanner.close();
    }
}
