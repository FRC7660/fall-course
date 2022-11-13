import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
    public static final int DECKSIZE = 52;
    ArrayList<Card> deck = new ArrayList<Card>(DECKSIZE);
    int numdealt = 0;

    public CardDeck() {
        createCardsforSuit("Clubs ", 1);
        createCardsforSuit("Dimnds", 2);
        createCardsforSuit("Hearts", 3);
        createCardsforSuit("Spades", 4);
    }
    private void createCardsforSuit(String s, int v){
        deck.add(new Card(v, " 2 of " + s));
        deck.add(new Card(v+4, " 3 of " + s));
        deck.add(new Card(v+8, " 4 of " + s));
        deck.add(new Card(v+12, " 5 of " + s));
        deck.add(new Card(v+16, " 6 of " + s));
        deck.add(new Card(v+20, " 7 of " + s));
        deck.add(new Card(v+24, " 8 of " + s));
        deck.add(new Card(v+28, " 9 of " + s));
        deck.add(new Card(v+32, "10 of " + s));
        deck.add(new Card(v+36, " J of " + s));
        deck.add(new Card(v+40, " Q of " + s));
        deck.add(new Card(v+44, " K of " + s));
        deck.add(new Card(v+48, " A of " + s));
    }

    public Card pickCardatRandom(){
        if(numdealt >= DECKSIZE){
            System.out.println("All Cards Dealt!");
            return deck.get(0);
        }
        Card selectedCard;
        Random r = new Random();
        do{
            selectedCard = deck.get(r.nextInt(DECKSIZE));
        }while(selectedCard.dealt == true);
        selectedCard.dealt = true;
        numdealt++;
        return selectedCard;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < deck.size(); i++) {
            s = s + deck.get(i).toString() + "\n";
        }
        return s;
    }
}

class Card {
    public int value; // 2 3 . . . Q, K, A, and for ties: Clb, Dmd, Hrts, Spds
    public String name;// e.g., "A of Spades" or "3 of Dimnds"
    public boolean dealt;

    public Card(int v, String n) {
        value = v;
        name = n;
        dealt = false;
    }

    public String toString() {
        return  " _______________\n" + 
                "|               |\n" +
                "| " + name + "  |\n" +
//                "      (" + value + ")" + "\n" + 
                "|_______________|\n";
    }
}