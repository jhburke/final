/**
 * Final Homework (WAR)
 * John Burke
 * This is the class that runs the war game.
 */

public class WarRun {
    public static void main(String[] args) {
        // Create Deck
        DeckStack deck = new DeckStack();


        //Create player 1 stack
        CardStack player1Hand = new CardStack();

        //Creates Player2 stack
        CardStack player2Hand = new CardStack();

        //Create Cards for deck
        deck.addCard(new Card("Clubs", 2, "src/cardpics/2c.jpg"));
        deck.addCard(new Card("Diamonds", 2, "src/cardpics/2d.jpg"));
        deck.addCard(new Card("Hearts", 2, "src/cardpics/2h.jpg"));
        deck.addCard(new Card("Spades", 2, "src/cardpics/2s.jpg"));

        deck.addCard(new Card("Clubs", 3, "src/cardpics/3c.jpg"));
        deck.addCard(new Card("Diamonds", 3, "src/cardpics/3d.jpg"));
        deck.addCard(new Card("Hearts", 3, "src/cardpics/3h.jpg"));
        deck.addCard(new Card("Spades", 3, "src/cardpics/3s.jpg"));

        deck.addCard(new Card("Clubs", 4, "src/cardpics/4c.jpg"));
        deck.addCard(new Card("Diamonds", 4, "src/cardpics/4d.jpg"));
        deck.addCard(new Card("Hearts", 4, "src/cardpics/4h.jpg"));
        deck.addCard(new Card("Spades", 4, "src/cardpics/4s.jpg"));

        deck.addCard(new Card("Clubs", 5, "src/cardpics/5c.jpg"));
        deck.addCard(new Card("Diamonds", 5, "src/cardpics/5d.jpg"));
        deck.addCard(new Card("Hearts", 5, "src/cardpics/5h.jpg"));
        deck.addCard(new Card("Spades", 5, "src/cardpics/5s.jpg"));

        deck.addCard(new Card("Clubs", 6, "src/cardpics/6c.jpg"));
        deck.addCard(new Card("Diamonds", 6, "src/cardpics/6d.jpg"));
        deck.addCard(new Card("Hearts", 6, "src/cardpics/6h.jpg"));
        deck.addCard(new Card("Spades", 6, "src/cardpics/6s.jpg"));

        deck.addCard(new Card("Clubs", 7, "src/cardpics/7c.jpg"));
        deck.addCard(new Card("Diamonds", 7, "src/cardpics/7d.jpg"));
        deck.addCard(new Card("Hearts", 7, "src/cardpics/7h.jpg"));
        deck.addCard(new Card("Spades", 7, "src/cardpics/7s.jpg"));

        deck.addCard(new Card("Clubs", 8, "src/cardpics/8c.jpg"));
        deck.addCard(new Card("Diamonds", 8, "src/cardpics/8d.jpg"));
        deck.addCard(new Card("Hearts", 8, "src/cardpics/8h.jpg"));
        deck.addCard(new Card("Spades", 8, "src/cardpics/8s.jpg"));

        deck.addCard(new Card("Clubs", 9, "src/cardpics/9c.jpg"));
        deck.addCard(new Card("Diamonds", 9, "src/cardpics/9d.jpg"));
        deck.addCard(new Card("Hearts", 9, "src/cardpics/9h.jpg"));
        deck.addCard(new Card("Spades", 9, "src/cardpics/9s.jpg"));

        deck.addCard(new Card("Clubs", 10, "src/cardpics/10c.jpg"));
        deck.addCard(new Card("Diamonds", 10, "src/cardpics/10d.jpg"));
        deck.addCard(new Card("Hearts", 10, "src/cardpics/10h.jpg"));
        deck.addCard(new Card("Spades", 10, "src/cardpics/10s.jpg"));

        deck.addCard(new Card("Clubs", 11, "src/cardpics/jackc.jpg"));
        deck.addCard(new Card("Diamonds", 11, "src/cardpics/jackd.jpg"));
        deck.addCard(new Card("Hearts", 11, "src/cardpics/jackh.jpg"));
        deck.addCard(new Card("Spades", 11, "src/cardpics/jacks.jpg"));

        deck.addCard(new Card("Clubs", 12, "src/cardpics/queenc.jpg"));
        deck.addCard(new Card("Diamonds", 12, "src/cardpics/queend.jpg"));
        deck.addCard(new Card("Hearts", 12, "src/cardpics/queenh.jpg"));
        deck.addCard(new Card("Spades", 12, "src/cardpics/queens.jpg"));

        deck.addCard(new Card("Clubs", 13, "src/cardpics/kingc.jpg"));
        deck.addCard(new Card("Diamonds", 13, "src/cardpics/kingd.jpg"));
        deck.addCard(new Card("Hearts", 13, "src/cardpics/kingh.jpg"));
        deck.addCard(new Card("Spades", 13, "src/cardpics/kings.jpg"));

        deck.addCard(new Card("Clubs", 14, "src/cardpics/acec.jpg"));
        deck.addCard(new Card("Diamonds", 14, "src/cardpics/aced.jpg"));
        deck.addCard(new Card("Hearts", 14, "src/cardpics/aceh.jpg"));
        deck.addCard(new Card("Spades", 14, "src/cardpics/aces.jpg"));

        // shuffle deck
        deck.shuffle();

        // print reshuffled deck
        // System.out.println(deck);

        // cut cards into two piles.
        while (deck.size() > 0) {
            player1Hand.addCard(deck.getCard());
            player2Hand.addCard(deck.getCard());
        }


        // driver for the GUI
        new WarGUI(player1Hand, player2Hand);


    }

}