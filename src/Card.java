/**
 * Final Homework (WAR)
 * John Burke
 * Card class holds data about a single card.
 */
public class Card {
    // Variables
    private int rank;
    private String suit;
    private String imageURL;


    /**
     * Main Constructor that sets all of the variables.
     *
     * @param suit set suit
     * @param rank set rank
     * @param image set image URL
     */
    public Card(String suit, int rank, String image) {
        this.suit = suit;
        this.rank = rank;
        this.imageURL = image;
    }

    /**
     * Method that retrieves the rank of the card.
     *
     * @return rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Method that retrieves the image url.
     *
     * @return image URL
     */
    public String getImageURL() {
        return imageURL;
    }


    /**
     * Method that determines if two cards are equal in rank.
     *
     * @param that other card
     * @return boolean value true or false
     */
    public boolean equal(Card that) {
        if (this.rank == that.rank) {
            return true;
        } else
            return false;
    }

    /**
     * Simple to String method
     *
     * @return name of card
     */
    public String toString() {

        if (rank == 11) {
            return suit + ":" + "Jack(11)";
        } else if (rank == 12) {
            return suit + ":" + "Queen(12)";
        } else if (rank == 13) {
            return suit + ":" + "King(13)";
        } else if (rank == 14) {
            return suit + ":" + "Ace(14)";
        } else
            return suit + ":" + rank;
    }


}

