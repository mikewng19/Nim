
//Michael Wong

/**
 * The game of nim. The rules are the players cannot remove more than half the
 * pile size at a given time.
 *
 *
 */
public class Nim {

    private Pile pile ;
    private int amountRemoved ;

    /**
     * Creates a new pile of marbles and displays the initial pile size.
     */
    public Nim() {

        pile = new Pile() ; //Generates a random # of marbles.
        System.out.println("=====================================" + "\n") ;
        System.out.println("Initial Pile Size: " + pile.getSize()) ;
    }

    /**
     * Plays the game by making player1 and player2 make a move.
     *
     * @param player Contains the type of 'player' playing.
     * 
     */
    public void play(Player[] player) {

        int amountRemoved; //contains the amount of marbles to remove from the 
        //pile
        
        //While there is still marbles in the pile keep playing.
        while (pile.getSize() != 0) {
            
            //Player 1's move and output
            //Pile size will display as 0 because 1/2 as an int is equal to 0.
            //So this if statement displays a custom output if the pilesize is 1
            if (pile.getSize() == 1) {
             
                System.out.println(player[0].getName()
                        + "'s Turn " + "(You can remove half of the pile size "
                        + "1" + "): ") ;

            } else {
                
                System.out.println(player[0].getName()
                        + "'s Turn " + "(You can remove half of the pile size "
                        + (pile.getSize() / 2) + "): ") ;
            }

            amountRemoved = player[0].move(pile.getSize()) ; //'Asks' the player
            //for the amount to remove
            pile.removeMarble(amountRemoved) ; //Player2 has made its move.

            System.out.println(player[0].getName() + " removed "
                    + amountRemoved + " marbles.") ;
                  
            System.out.println("\n" + "Pile Size: " + pile.getSize()) ;
            
            //If you pick up the last marble in the game of nim, you lose.
            //so the other player wins.
            if (pile.getSize() == 0) {
                
                //displays the winner, the winners name and object type.    
                System.out.println("\n" +"Game Over! " + player[1].getName() 
                    + " - " + player[1].playerType() +" is the Winner!!") ;
                break; //if there is a winner break the loop.
                
            }
            
            //Player 2's move and output
            //Pile size will display as 0 because 1/2 as an int is equal to 0.
            //So this if statement displays a custom output if the pilesize is 1
            if (pile.getSize() == 1) {
              
                  System.out.println(player[1].getName()
                        + "'s Turn " + "(You can remove half of the pile size "
                        + "1" + "): ") ;

            } else {
                
                System.out.println(player[1].getName()
                        + "'s Turn " + "(You can remove half of the pile size "
                        + (pile.getSize() / 2) + "): ") ;
            }
            
            amountRemoved = player[1].move(pile.getSize()) ; //'Asks' the player
            //for the amount to remove
            pile.removeMarble(amountRemoved) ; //Player2 has made its move.

            System.out.println(player[1].getName() + " removed "
                    + amountRemoved + " marbles.") ;

            System.out.println("\n" + "Pile Size: " + pile.getSize()) ;
            
            //If you pick up the last marble in the game of nim, you lose.
            //so the other player wins.
            if (pile.getSize() == 0) {
                
                //displays the winner, the winners name and object type.
                System.out.println("\n" +"Game Over! "+ player[0].getName() 
                        + ", " + player[0].playerType() +" is the Winner!!") ;
                break; //if there is a winner break the loop.

            }
        }
    }
}
