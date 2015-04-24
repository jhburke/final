import java.util.ArrayList;

/**
 * Final Homework (WAR)
 * John Burke
 * The GamePosition class holds data about he current position of the war game.
 * All information gets pipped into the GUI for viewing.
 */


public class GamePosition {

    // variables
    private int player1DeckSize;
    private int player2DeckSize;
    private String winnerIs;
    private ArrayList<Card> player1ReturnedCards;
    private ArrayList<Card> player2ReturnedCards;

    /**
     * Simple Constructor
     */

    public GamePosition(){

    }

    /**
     * Method that sets the player 1 deck size.
     *
     * @param num deck size
     */
    public void setPlayer1DeckSize(int num) {
        this.player1DeckSize = num;
    }

    /**
     * Method that sets the player 2 deck size.
     *
     * @param num deck size
     */
    public void setPlayer2DeckSize(int num) {
        this.player2DeckSize = num;
    }

    /**
     * Method that sets the winning message.
     *
     * @param str message for winner
     */
    public void setWinnerIs(String str) {
        this.winnerIs = str;
    }

    /**
     * Method that sets the cards that player 1 used.
     *
     * @param p1 set cards used
     */
    public void setPlayer1ReturnedCards(ArrayList<Card> p1) {
        this.player1ReturnedCards = p1;
    }

    /**
     * Method that sets the cards player 2 used.
     *
     * @param p2 set cards used
     */
    public void setPlayer2ReturnedCards(ArrayList<Card> p2) {
        this.player2ReturnedCards = p2;
    }

    /**
     * Method that returns the player 1 deck size.
     *
     * @return deck size
     */
    public int getPlayer1DeckSize() {
        return player1DeckSize;
    }

    /**
     * Method that returns the player 2 deck size.
     *
     * @return deck size
     */
    public int getPlayer2DeckSize() {
        return player2DeckSize;
    }

    /**
     * Method that returns the winning message.
     *
     * @return winner message
     */
    public String getWinnerIs() {
        return winnerIs;
    }

    /**
     * Method that returns the cards used by player 1.
     *
     * @return cards used in match
     */
    public ArrayList<Card> getPlayer1ReturnedCards() {
        return player1ReturnedCards;
    }

    /**
     * Method that returns the cards used by player 2.
     *
     * @return cards used in match
     */
    public ArrayList<Card> getPlayer2ReturnedCards() {
        return player2ReturnedCards;
    }


}