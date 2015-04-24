import java.util.Collections;

/**
 * Final Homework (WAR)
 * John Burke
 * DeckStack extends CardStack and adds a shuffle method.
 */
public class DeckStack extends CardStack {
    /**
     * Constructor that sets the array list with a super call.
     */
    public DeckStack() {
        super();
    }

    /**
     * Shuffle method that rearranges the array list cards.
     */
    public void shuffle() {
        Collections.shuffle(stack);
    }


}

