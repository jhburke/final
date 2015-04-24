
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Final Homework (WAR)
 * John Burke
 * This class holds all the information on the GUI. The Frame is created and the Panels are added into it.
 * Panels are updated when the user clicks on the press play button
 */

public class WarGUI extends JFrame {

    // variables that will be used in the construction of the GUI.
    private JPanel leftPanel;
    private JPanel middlePanel;
    private JPanel rightPanel;

    private String imageurl_1 ="src/cardpics/back.jpg";
    private String imageurl_2 = "src/cardpics/back.jpg";

    private String winner = " ";
    private int playerOneSize = 26;
    private int playerTwoSize = 26 ;
    private CardStack player1Hand;
    private CardStack player2Hand;

    /**
     * Constructor that accepts two card stacks which are the two players decks.
     * @param p1 player 1 card stack
     * @param p2 player 2 card stack
     */
    public WarGUI(CardStack p1, CardStack p2){

        this.player1Hand = p1;
        this.player2Hand = p2;


        setTitle("War by John Burke");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.DARK_GRAY);

        buildLeftPanel();
        buildRightPanel();
        buildMiddlePanel();
        this.setLayout(new BorderLayout());
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel,BorderLayout.EAST);
        this.add(middlePanel,BorderLayout.CENTER);

        setVisible(true);

    }

    /**
     * Method that creates the left panel in the GUI.
     */
    private void buildLeftPanel(){
        JLabel player1 = new JLabel("Player 1:                       ");
        player1.setFont(new Font("Open Sans",Font.PLAIN,24));
        JLabel leftvalue = new JLabel("Player 1 Deck Size: "+ playerOneSize);
        leftvalue.setFont(new Font("Comic Sans", Font.PLAIN, 20));

        ImageIcon img = new ImageIcon(imageurl_1);
        JLabel leftimage = new JLabel(img);


        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());

        //add stuff into panel
        leftPanel.add(player1,BorderLayout.NORTH);
        leftPanel.add(leftimage,BorderLayout.WEST);
        leftPanel.add(leftvalue,BorderLayout.SOUTH);


    }

    /**
     * Method that creates the right panel in the GUI.
     */
    private void buildRightPanel(){
        JLabel player2 = new JLabel("                           Player 2:");
        player2.setFont(new Font("Open Sans",Font.PLAIN,24));
        JLabel rightvalue = new JLabel("Player 2 Deck Size: " + playerTwoSize );
        rightvalue.setFont(new Font("Comic Sans",Font.PLAIN,20));

        ImageIcon img = new ImageIcon(imageurl_2);
        JLabel rightimage = new JLabel(img);


        rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        //add stuff into panel
        rightPanel.add(player2,BorderLayout.NORTH);
        rightPanel.add(rightimage,BorderLayout.EAST);
        rightPanel.add(rightvalue,BorderLayout.SOUTH);

    }

    /**
     * Method that creates the middle panel in the GUI.
     */
    private void buildMiddlePanel(){
        JLabel directions = new JLabel("               Press play to begin");
        directions.setFont(new Font("Open Sans",Font.PLAIN,18));
        JLabel roundWinner = new JLabel("         "+  winner);
        roundWinner.setFont(new Font("Comic Sans",Font.PLAIN,24));

        JButton play = new JButton("Play/Play Again");
        play.addActionListener(new PlayButtonMain());

        middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());

        middlePanel.add(play,BorderLayout.NORTH);
        middlePanel.add(roundWinner, BorderLayout.CENTER);
        middlePanel.add(directions, BorderLayout.SOUTH);


    }

    /**
     * Button class which users the ActonListener
     */
    public class PlayButtonMain implements ActionListener {

        /**
         * Button that updated with each push. Reassigns values to the panels for updating the GUI.
         * @param e button action
         */
        public void actionPerformed(ActionEvent e){
            GamePosition a;
            a = WarMain.WarMainMethod(player1Hand, player2Hand);

            imageurl_1 = a.getPlayer1ReturnedCards().get(0).getImageURL();
            imageurl_2 = a.getPlayer2ReturnedCards().get(0).getImageURL();
            playerOneSize = a.getPlayer1DeckSize();
            playerTwoSize = a.getPlayer2DeckSize();
            winner = a.getWinnerIs();

            // Command line print out for double checking everything.
            System.out.println(a.getWinnerIs());
            System.out.println(a.getPlayer1DeckSize());
            System.out.println(a.getPlayer2DeckSize());
            System.out.println(a.getPlayer1ReturnedCards());
            System.out.println(a.getPlayer2ReturnedCards());
            System.out.println(a.getPlayer1ReturnedCards().get(0).getImageURL());
            System.out.println(a.getPlayer2ReturnedCards().get(0).getImageURL());

            buildLeftPanel();
            buildRightPanel();
            buildMiddlePanel();
            setLayout(new BorderLayout());
            add(leftPanel, BorderLayout.WEST);
            add(rightPanel, BorderLayout.EAST);
            add(middlePanel, BorderLayout.CENTER);
            setVisible(true);

        }
    }

}
