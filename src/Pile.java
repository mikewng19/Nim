
//Michael Wong

import java.util.Random;


/**
 * Creates a pile of marbles and maintains the pileSize.
 * 
 */
public class Pile {

    private int amountOfMarbles = 0 ;
    
    /**
     * Creates a pile size of marbles by using random number generator.
     */
    public Pile() {
        
        Random gen = new Random() ;
        amountOfMarbles = gen.nextInt(71) + 20 ; //Generates a pile
        //by generating a random number between 20-95
    }
    
    /**
     * Gets the number of marbles in the current pile.
     * @return Returns the amount of marbles in the pile.
     */
    public int getSize() {

        return amountOfMarbles ;
    }
    
    /**
     * Removes a specified amount of marbles from both of the players.
     * @param amount the specified amount of marbles to remove from the pile.
     */
    public void removeMarble(int amount) {
        
        amountOfMarbles = amountOfMarbles - amount ;
    }

}
