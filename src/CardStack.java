
import java.util.*;
/**
 * Final Homework (WAR)
 * John Burke
 * The CardStack class holds Card objects in an array list.
 */


public class CardStack {
    // variable can be accessed by DeckStack
    protected ArrayList<Card> stack;

    /**
     * Basic Constructor
     */
    public CardStack() {
        stack = new ArrayList<Card>();
    }


    /**
     * Method that takes a card and adds it into the array list (card pile) on the bottom.
     *
     * @param card adds a card to the array list
     */
    public void addCard(Card card) {
        stack.add(card);
    }

    /**
     * Method that returns the top card of the array list (card pile).
     *
     * @return return top card
     */
    public Card getCard() {
        return stack.remove(0);
    }

    /**
     * Simple toString method showing the cards.
     *
     * @return shows cards
     */
    public String toString() {
        System.out.println("----CARDS----");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i).toString());
        }
        return "------------";
    }

    /**
     * Method that returns the size of the array list (card pile).
     *
     * @return size of the array
     */
    public int size() {
        return stack.size();
    }


}
