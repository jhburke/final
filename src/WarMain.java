
import java.util.ArrayList;

/**
 * Final Homework (WAR)
 * John Burke
 * This class is all about deciding what action to take with the two players.
 * Cards are drawn from the deck and checked to see who wins. If a player then they get both cards from the game.
 * If a war breaks out the game keeps going. I went to a double war with special cases on the way down. If a
 * players deck runs out they lose.
 */
public class WarMain {

    /**
     * This method takes two card decks and decides who the winner is. The information of the round is returned
     * as a GamePosition and used in the GUI.
     * @param player1Hand player 1 hand
     * @param player2Hand player 2 hand
     * @return gameReport for GUI
     *
     */
    public static GamePosition WarMainMethod(CardStack player1Hand, CardStack player2Hand) {

        GamePosition gameReport = new GamePosition();
        String player1Winner = "Player 1 Wins Round";
        String player2Winner = "Player 2 Wins Round";
        String totalWinner1 = "Player 1 Wins Overall Game";
        String totalWinner2 = "Player 2 Wins Overall Game";

        // Try statement that deals with when a player deck hits 0 and an exception is thrown.
        try {

            System.out.println("---------GAME MODE------------");

            Card player1card = player1Hand.getCard();
            Card player2card = player2Hand.getCard();


            if (player1card.getRank() > player2card.getRank()) {
                //player one wins and gets cards
                player1Hand.addCard(player1card);
                player1Hand.addCard(player2card);

                // package everything up in the game report and send it back
                ArrayList<Card> player1 = new ArrayList<Card>();
                ArrayList<Card> player2 = new ArrayList<Card>();
                player1.add(player1card);
                player2.add(player2card);
                gameReport.setPlayer1DeckSize(player1Hand.size());
                gameReport.setPlayer2DeckSize(player2Hand.size());
                gameReport.setPlayer1ReturnedCards(player1);
                gameReport.setPlayer2ReturnedCards(player2);
                gameReport.setWinnerIs(player1Winner);


            } else if (player1card.getRank() < player2card.getRank()) {
                //player two wins and gets both cards
                player2Hand.addCard(player1card);
                player2Hand.addCard(player2card);

                // package everything up in the game report and send it back
                ArrayList<Card> player1 = new ArrayList<Card>();
                ArrayList<Card> player2 = new ArrayList<Card>();
                player1.add(player1card);
                player2.add(player2card);
                gameReport.setPlayer1DeckSize(player1Hand.size());
                gameReport.setPlayer2DeckSize(player2Hand.size());
                gameReport.setPlayer1ReturnedCards(player1);
                gameReport.setPlayer2ReturnedCards(player2);
                gameReport.setWinnerIs(player2Winner);


            } else if (player1card.equal(player2card)) {
                System.out.println("----War-----");
                //war game begin here
                // if either player only has one card left in there hand
                if (player1Hand.size() == 1 || player2Hand.size() == 1) {
                    Card player1card1 = player1Hand.getCard();
                    Card player2card1 = player2Hand.getCard();

                    if (player1card1.getRank() > player2card1.getRank()) {
                        // first cards
                        player1Hand.addCard(player1card);
                        player1Hand.addCard(player2card);
                        // war cards
                        player1Hand.addCard(player1card1);
                        player1Hand.addCard(player2card1);

                        // package everything up in the game report and send it back
                        ArrayList<Card> player1 = new ArrayList<Card>();
                        ArrayList<Card> player2 = new ArrayList<Card>();
                        player1.add(player1card);
                        player1.add(player1card1);
                        player2.add(player2card);
                        player2.add(player2card1);
                        gameReport.setPlayer1DeckSize(player1Hand.size());
                        gameReport.setPlayer2DeckSize(player2Hand.size());
                        gameReport.setPlayer1ReturnedCards(player1);
                        gameReport.setPlayer2ReturnedCards(player2);
                        gameReport.setWinnerIs(player1Winner);


                    } else if (player1card1.getRank() < player2card1.getRank()) {
                        // first cards
                        player2Hand.addCard(player1card);
                        player2Hand.addCard(player2card);
                        //war cards
                        player2Hand.addCard(player1card1);
                        player2Hand.addCard(player2card1);

                        // package everything up in the game report and send it back
                        ArrayList<Card> player1 = new ArrayList<Card>();
                        ArrayList<Card> player2 = new ArrayList<Card>();
                        player1.add(player1card);
                        player1.add(player1card1);
                        player2.add(player2card);
                        player2.add(player2card1);
                        gameReport.setPlayer1DeckSize(player1Hand.size());
                        gameReport.setPlayer2DeckSize(player2Hand.size());
                        gameReport.setPlayer1ReturnedCards(player1);
                        gameReport.setPlayer2ReturnedCards(player2);
                        gameReport.setWinnerIs(player2Winner);


                    }
                    // if someone has no more cards in deck and the other person does the other person wins
                    else {
                        if (player1Hand.size() > player2Hand.size()) {
                            // package everything up in the game report and send it back
                            ArrayList<Card> player1 = new ArrayList<Card>();
                            ArrayList<Card> player2 = new ArrayList<Card>();
                            player1.add(player1card);
                            player1.add(player1card1);
                            player2.add(player2card);
                            player2.add(player2card1);
                            gameReport.setPlayer1DeckSize(player1Hand.size());
                            gameReport.setPlayer2DeckSize(player2Hand.size());
                            gameReport.setPlayer1ReturnedCards(player1);
                            gameReport.setPlayer2ReturnedCards(player2);
                            gameReport.setWinnerIs(player1Winner);

                        } else {
                            // package everything up in the game report and send it back
                            ArrayList<Card> player1 = new ArrayList<Card>();
                            ArrayList<Card> player2 = new ArrayList<Card>();
                            player1.add(player1card);
                            player1.add(player1card1);
                            player2.add(player2card);
                            player2.add(player2card1);
                            gameReport.setPlayer1DeckSize(player1Hand.size());
                            gameReport.setPlayer2DeckSize(player2Hand.size());
                            gameReport.setPlayer1ReturnedCards(player1);
                            gameReport.setPlayer2ReturnedCards(player2);
                            gameReport.setWinnerIs(player2Winner);

                        }
                    }
                } else {
                    Card player1card2 = player1Hand.getCard();
                    Card player1cardlook = player1Hand.getCard();

                    Card player2card2 = player2Hand.getCard();
                    Card player2cardlook = player2Hand.getCard();

                    if (player1cardlook.getRank() > player2cardlook.getRank()) {
                        // first cards
                        player1Hand.addCard(player1card);
                        player1Hand.addCard(player2card);
                        //flipped war cards
                        player1Hand.addCard(player1card2);
                        player1Hand.addCard(player1cardlook);
                        // face value war cards
                        player1Hand.addCard(player2card2);
                        player1Hand.addCard(player2cardlook);

                        // package everything up in the game report and send it back
                        ArrayList<Card> player1 = new ArrayList<Card>();
                        ArrayList<Card> player2 = new ArrayList<Card>();
                        player1.add(player1card);
                        player1.add(player1card2);
                        player1.add(player1cardlook);
                        player2.add(player2card);
                        player2.add(player2card2);
                        player2.add(player2cardlook);
                        gameReport.setPlayer1DeckSize(player1Hand.size());
                        gameReport.setPlayer2DeckSize(player2Hand.size());
                        gameReport.setPlayer1ReturnedCards(player1);
                        gameReport.setPlayer2ReturnedCards(player2);
                        gameReport.setWinnerIs(player1Winner);


                    } else if (player1cardlook.getRank() < player2cardlook.getRank()) {
                        player2Hand.addCard(player1card);
                        player2Hand.addCard(player2card);
                        player2Hand.addCard(player1card2);
                        player2Hand.addCard(player1cardlook);
                        player2Hand.addCard(player2card2);
                        player2Hand.addCard(player2cardlook);
                        // package everything up and return it for GUI to use
                        ArrayList<Card> player1 = new ArrayList<Card>();
                        ArrayList<Card> player2 = new ArrayList<Card>();
                        player1.add(player1card);
                        player1.add(player1card2);
                        player1.add(player1cardlook);
                        player2.add(player2card);
                        player2.add(player2card2);
                        player2.add(player2cardlook);
                        gameReport.setPlayer1DeckSize(player1Hand.size());
                        gameReport.setPlayer2DeckSize(player2Hand.size());
                        gameReport.setPlayer1ReturnedCards(player1);
                        gameReport.setPlayer2ReturnedCards(player2);
                        gameReport.setWinnerIs(player2Winner);


                    }
                    // getting sticky with war on war

                    else {
                        System.out.println("---Double War----");
                        if (player1Hand.size() == 0 || player2Hand.size() == 0) {
                            if (player1Hand.size() == 0) {
                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player2Winner);

                            } else {
                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player1Winner);

                            }
                        } else if (player1Hand.size() == 1 || player2Hand.size() == 1) {
                            Card oneleft1 = player1Hand.getCard();
                            Card oneleft2 = player2Hand.getCard();
                            if (oneleft1.getRank() > oneleft2.getRank()) {
                                player1Hand.addCard(oneleft1);
                                player1Hand.addCard(oneleft2);
                                player1Hand.addCard(player1card);
                                player1Hand.addCard(player2card);
                                player1Hand.addCard(player1card2);
                                player1Hand.addCard(player1cardlook);
                                player1Hand.addCard(player2card2);
                                player1Hand.addCard(player2cardlook);

                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player1.add(oneleft1);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                player2.add(oneleft2);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player1Winner);


                            } else if (oneleft1.getRank() < oneleft2.getRank()) {
                                player2Hand.addCard(oneleft1);
                                player2Hand.addCard(oneleft2);
                                player2Hand.addCard(player1card);
                                player2Hand.addCard(player2card);
                                player2Hand.addCard(player1card2);
                                player2Hand.addCard(player1cardlook);
                                player2Hand.addCard(player2card2);
                                player2Hand.addCard(player2cardlook);

                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player1.add(oneleft1);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                player2.add(oneleft2);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player2Winner);
                            }
                            //player deck default winner again
                            else {
                                if (player1Hand.size() > player2Hand.size()) {
                                    // package everything up and return it for GUI to use
                                    ArrayList<Card> player1 = new ArrayList<Card>();
                                    ArrayList<Card> player2 = new ArrayList<Card>();
                                    player1.add(player1card);
                                    player1.add(player1card2);
                                    player1.add(player1cardlook);
                                    player1.add(oneleft1);
                                    player2.add(player2card);
                                    player2.add(player2card2);
                                    player2.add(player2cardlook);
                                    player2.add(oneleft2);
                                    gameReport.setPlayer1DeckSize(player1Hand.size());
                                    gameReport.setPlayer2DeckSize(player2Hand.size());
                                    gameReport.setPlayer1ReturnedCards(player1);
                                    gameReport.setPlayer2ReturnedCards(player2);
                                    gameReport.setWinnerIs(player1Winner);
                                } else {
                                    // package everything up and return it for GUI to use
                                    ArrayList<Card> player1 = new ArrayList<Card>();
                                    ArrayList<Card> player2 = new ArrayList<Card>();
                                    player1.add(player1card);
                                    player1.add(player1card2);
                                    player1.add(player1cardlook);
                                    player1.add(oneleft1);
                                    player2.add(player2card);
                                    player2.add(player2card2);
                                    player2.add(player2cardlook);
                                    player2.add(oneleft2);
                                    gameReport.setPlayer1DeckSize(player1Hand.size());
                                    gameReport.setPlayer2DeckSize(player2Hand.size());
                                    gameReport.setPlayer1ReturnedCards(player1);
                                    gameReport.setPlayer2ReturnedCards(player2);
                                    gameReport.setWinnerIs(player2Winner);
                                }
                            }
                        } else {
                            Card warcard1 = player1Hand.getCard();
                            Card warcardlook1 = player1Hand.getCard();
                            Card warcard2 = player2Hand.getCard();
                            Card warcardlook2 = player2Hand.getCard();
                            if (warcardlook1.getRank() > warcardlook2.getRank()) {
                                // double war cards
                                player1Hand.addCard(warcard1);
                                player1Hand.addCard(warcardlook1);
                                player1Hand.addCard(warcard2);
                                player1Hand.addCard(warcardlook2);
                                // og cards
                                player1Hand.addCard(player1card);
                                player1Hand.addCard(player2card);
                                player1Hand.addCard(player1card2);
                                player1Hand.addCard(player1cardlook);
                                player1Hand.addCard(player2card2);
                                player1Hand.addCard(player2cardlook);

                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player1.add(warcard1);
                                player1.add(warcardlook1);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                player2.add(warcard2);
                                player2.add(warcardlook2);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player1Winner);


                            } else if (warcard1.getRank() < warcard2.getRank()) {
                                // double war cards
                                player2Hand.addCard(warcard1);
                                player2Hand.addCard(warcardlook1);
                                player2Hand.addCard(warcard2);
                                player2Hand.addCard(warcardlook2);
                                // og cards
                                player2Hand.addCard(player1card);
                                player2Hand.addCard(player2card);
                                player2Hand.addCard(player1card2);
                                player2Hand.addCard(player1cardlook);
                                player2Hand.addCard(player2card2);
                                player2Hand.addCard(player2cardlook);

                                // package everything up and return it for GUI to use
                                ArrayList<Card> player1 = new ArrayList<Card>();
                                ArrayList<Card> player2 = new ArrayList<Card>();
                                player1.add(player1card);
                                player1.add(player1card2);
                                player1.add(player1cardlook);
                                player1.add(warcard1);
                                player1.add(warcardlook1);
                                player2.add(player2card);
                                player2.add(player2card2);
                                player2.add(player2cardlook);
                                player2.add(warcard2);
                                player2.add(warcardlook2);
                                gameReport.setPlayer1DeckSize(player1Hand.size());
                                gameReport.setPlayer2DeckSize(player2Hand.size());
                                gameReport.setPlayer1ReturnedCards(player1);
                                gameReport.setPlayer2ReturnedCards(player2);
                                gameReport.setWinnerIs(player2Winner);

                            }
                            // after double war i just do a sudden death match with the card that was left down
                            else {
                                System.out.println("---Sudden Death---");
                                if (warcard1.getRank() > warcard2.getRank()) {
                                    player1Hand.addCard(warcard1);
                                    player1Hand.addCard(warcardlook1);
                                    player1Hand.addCard(warcard2);
                                    player1Hand.addCard(warcardlook2);
                                    player1Hand.addCard(player1card);
                                    player1Hand.addCard(player2card);
                                    player1Hand.addCard(player1card2);
                                    player1Hand.addCard(player1cardlook);
                                    player1Hand.addCard(player2card2);
                                    player1Hand.addCard(player2cardlook);

                                    // package everything up and return it for GUI to use
                                    ArrayList<Card> player1 = new ArrayList<Card>();
                                    ArrayList<Card> player2 = new ArrayList<Card>();
                                    player1.add(player1card);
                                    player1.add(player1card2);
                                    player1.add(player1cardlook);
                                    player1.add(warcard1);
                                    player1.add(warcardlook1);
                                    player2.add(player2card);
                                    player2.add(player2card2);
                                    player2.add(player2cardlook);
                                    player2.add(warcard2);
                                    player2.add(warcardlook2);
                                    gameReport.setPlayer1DeckSize(player1Hand.size());
                                    gameReport.setPlayer2DeckSize(player2Hand.size());
                                    gameReport.setPlayer1ReturnedCards(player1);
                                    gameReport.setPlayer2ReturnedCards(player2);
                                    gameReport.setWinnerIs(player1Winner);

                                } else if (warcard1.getRank() < warcard2.getRank()) {
                                    player2Hand.addCard(warcard1);
                                    player2Hand.addCard(warcardlook1);
                                    player2Hand.addCard(warcard2);
                                    player2Hand.addCard(warcardlook2);
                                    player2Hand.addCard(player1card);
                                    player2Hand.addCard(player2card);
                                    player2Hand.addCard(player1card2);
                                    player2Hand.addCard(player1cardlook);
                                    player2Hand.addCard(player2card2);
                                    player2Hand.addCard(player2cardlook);
                                    //final double war

                                    // package everything up and return it for GUI to use
                                    ArrayList<Card> player1 = new ArrayList<Card>();
                                    ArrayList<Card> player2 = new ArrayList<Card>();
                                    player1.add(player1card);
                                    player1.add(player1card2);
                                    player1.add(player1cardlook);
                                    player1.add(warcard1);
                                    player1.add(warcardlook1);
                                    player2.add(player2card);
                                    player2.add(player2card2);
                                    player2.add(player2cardlook);
                                    player2.add(warcard2);
                                    player2.add(warcardlook2);
                                    gameReport.setPlayer1DeckSize(player1Hand.size());
                                    gameReport.setPlayer2DeckSize(player2Hand.size());
                                    gameReport.setPlayer1ReturnedCards(player1);
                                    gameReport.setPlayer2ReturnedCards(player2);
                                    gameReport.setWinnerIs(player2Winner);

                                }
                                //double war with a matched back card, then whoever has biggest deck wins
                                else {
                                    if (player1Hand.size() > player2Hand.size()) {
                                        // package everything up and return it for GUI to use
                                        ArrayList<Card> player1 = new ArrayList<Card>();
                                        ArrayList<Card> player2 = new ArrayList<Card>();
                                        player1.add(player1card);
                                        player1.add(player1card2);
                                        player1.add(player1cardlook);
                                        player1.add(warcard1);
                                        player1.add(warcardlook1);
                                        player2.add(player2card);
                                        player2.add(player2card2);
                                        player2.add(player2cardlook);
                                        player2.add(warcard2);
                                        player2.add(warcardlook2);
                                        gameReport.setPlayer1DeckSize(player1Hand.size());
                                        gameReport.setPlayer2DeckSize(player2Hand.size());
                                        gameReport.setPlayer1ReturnedCards(player1);
                                        gameReport.setPlayer2ReturnedCards(player2);
                                        gameReport.setWinnerIs(player1Winner);
                                    } else {
                                        // package everything up and return it for GUI to use
                                        ArrayList<Card> player1 = new ArrayList<Card>();
                                        ArrayList<Card> player2 = new ArrayList<Card>();
                                        player1.add(player1card);
                                        player1.add(player1card2);
                                        player1.add(player1cardlook);
                                        player1.add(warcard1);
                                        player1.add(warcardlook1);
                                        player2.add(player2card);
                                        player2.add(player2card2);
                                        player2.add(player2cardlook);
                                        player2.add(warcard2);
                                        player2.add(warcardlook2);
                                        gameReport.setPlayer1DeckSize(player1Hand.size());
                                        gameReport.setPlayer2DeckSize(player2Hand.size());
                                        gameReport.setPlayer1ReturnedCards(player1);
                                        gameReport.setPlayer2ReturnedCards(player2);
                                        gameReport.setWinnerIs(player2Winner);
                                    }

                                }

                            }
                        }

                    }


                }

            }


        } catch (IndexOutOfBoundsException ex) {
            // Deals with end of game if someone has no more cards.
            if (player1Hand.size() == 0) {
                ArrayList<Card> player1 = new ArrayList<Card>();
                ArrayList<Card> player2 = new ArrayList<Card>();
                Card win = new Card("null", 0, "src/cardpics/winnerCard.png");
                Card lose = new Card("null", 0, "src/cardpics/back.jpg");
                player1.add(lose);
                player2.add(win);
                gameReport.setPlayer1DeckSize(player1Hand.size());
                gameReport.setPlayer2DeckSize(player2Hand.size());
                gameReport.setWinnerIs(totalWinner2);
                gameReport.setPlayer1ReturnedCards(player1);
                gameReport.setPlayer2ReturnedCards(player2);
            }
            if (player2Hand.size() == 0) {
                ArrayList<Card> player1 = new ArrayList<Card>();
                ArrayList<Card> player2 = new ArrayList<Card>();
                Card win = new Card("null", 0, "src/cardpics/winnerCard.png");
                Card lose = new Card("null", 0, "src/cardpics/back.jpg");
                player1.add(win);
                player2.add(lose);
                gameReport.setPlayer1DeckSize(player1Hand.size());
                gameReport.setPlayer2DeckSize(player2Hand.size());
                gameReport.setWinnerIs(totalWinner1);
                gameReport.setPlayer1ReturnedCards(player1);
                gameReport.setPlayer2ReturnedCards(player2);
            }

        }
        return gameReport;
    }
}

