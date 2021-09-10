
//Michael Wong

import java.util.Scanner;

/**
 * Human player is a player that's human ha ha. it asks the user/player the
 * amount of marbles they want to remove.
 *
 */
public class Human implements Player {

    String name = "" ;

    /**
     * Gets the amount of marbles to remove by asking a user to enter an amount.
     *
     * @param pileSize contains the amount of marbles in a pile
     * @return Returns the amount of marbles that user wants to remove.
     */
    public int move(int pileSize) {

        boolean validMove = false ;
        int usersInput = 0 ;

        Scanner input = new Scanner(System.in);

        while (!validMove) {

            //If the pileSize is one, 1/2 = 0 in integer form so
            //if there is one left auto remove 1 marble from the board.
            if (pileSize == 1) {
                
                return 1 ;
            } else {
                
                //while loop makes sure that the player enters a integer
                while (!input.hasNextInt()) { //Keep looping till the user 
                    //enters a valid input
                    
                    System.out.println("Please enter a valid number."
                            + "(You can remove half of the pile size "
                            + (pileSize / 2) + "): ") ;
                    
                    input.next() ; //Throws away the invalid input.
                }

                usersInput = input.nextInt() ; //Gets the valid integer.
                
                //user can input a maxium of half the pile size and the 
                //minium amount is 1.
                if (usersInput <= (pileSize / 2) && usersInput >= 1) {
                    
                    validMove = true ;
                } else {

                    System.out.println("Please enter a valid number."
                            + "(You can remove half of the pile size "
                            + pileSize / 2 + "): ") ;
                }
            }

        }
        return usersInput ;
    }

    /**
     * Gives the player a name specified by the user.
     *
     * @param playerName Contains the given player name.
     */
    public void setName(String playerName) {
        
        name = playerName ;
    }

    /**
     * returns the name specified by the user.
     *
     * @return returns the name specified by the user.
     */
    public String getName() {

        return name ;
    }
    
    /**
     * Returns the type of player as a string.
     * @return The type of player as a string.
     */
    public String playerType(){
        
        return "the Human Object" ;
    }

}
