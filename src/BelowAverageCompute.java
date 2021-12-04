
//Michael Wong

import java.util.Random;

/**
 * The BelowAverageComputer plays by generating a random number between
 * 1-(pilesize/2) aka stupid computer.
 * 
 */
public class BelowAverageComputer implements Player {

    String name = "";
    
    /**
     * Generates a random # that specifies the amount of marbles
     * to remove from the pile. 
     * @param pileSize contains the current amount of marbles in the pile.
     * @return The specific amount of marbles to remove from the pile.
     */
    public int move(int pileSize) {
        
        Random gen = new Random() ; 
        
        //Pile size has to be greater than 1 because 1/2 = 0 as an integer.
        if (pileSize > 1) { 
            
            return gen.nextInt((pileSize/2)) + 1 ;
        } else {
           
            return 1 ;
        }
         //Generates a random #
        //that specifies the amount of marbles to remove from the pile.
    }
    
    /**
     * Gives the player a name specified by the user.
     * @param playerName Contains the given player name.
     */
    public void setName(String playerName) {
        name = playerName ;
    }
    
    /**
     * returns the name specified by the user.
     * @return returns the name specified by the user.
     */
    public String getName() {

        return name ;
    }
    
    /**
    * Returns the type of player as a string.
    * @return The type of player as a string.
    */
    public String playerType() {
        
        return "the Below Average/Stupid Computer Object";
    }
}
