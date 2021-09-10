
//Michael Wong

import java.util.Random;

/**
 * SmartComputer plays by removing enough marbles to get a number that is a
 * power of 2 minus 1
 *
 */
public class SmartComputer implements Player {

    String name = "";

    /**
     * Gets the number of marbles to remove from the pile
     *
     * @param pileSize Contains the amount of marbles in the pile.
     * @return The amount of marbles to remove from the pile.
     */
    public int move(int pileSize) {

        boolean endLoop = false ;
        int removeAmount = (pileSize / 2);  //Remove limit on a turn.
        int tempPile ;                      //temporary pile to simulate a turn.
        String binary ;                     //contains the converted int

        int counter = 0 ; //Keeps count of all the 1's in the binary string.

        /*How I figured out if a the pile is a power of two minus one after a 
        move is by converting the pile into a binary string after a simulated 
        move. Why? well because a number to the power of 2 minus 1 in binary 
        contains all 1's. For example lets say we have 31. 31 in binary is 11111
        , 15 is 1111, 7 is 111 etc... So by grabbing the numbers binary value in
        a string. We can count the amount of ones and compare it to the binary 
        string length and see if removeAmount is a valid amount of moves to get 
        a power of 2 minus 1. If not the program removes the amount removed by 1 
        and then it tests this all over again.*/
        
        if (pileSize >= 1 && pileSize <=3) {
            //if the pilesize is 1. then remove 1 marble. no need to run the
            //loop again... because all of 2,3 divided by 2 is 1 just 1. 
            //(as in integer)
            
            return 1 ;
         
        } else {

            while (!endLoop) {
                //simulates a move by using creating a temporary pile
                tempPile = pileSize - removeAmount ;

                //now we convert temp pile to a binary string.
                binary = Integer.toBinaryString(tempPile) ;

                //a loop to count how many 1's are in the binary string.
                for (int i = 0; i < binary.length(); i++) {
                    if (binary.charAt(i) == '1') {
                        counter++; //if '1' is found, counter increments by 1.
                    }
                }
                
                if (binary.length() == counter) {
                    //if it finds a sucessful remove amount to get the pile size 
                    //to a number to power of two -1, then return the remove  
                    //amount to get that pile size.

                    return removeAmount;
                    
                } else if (removeAmount == 1) {
                    
                    //at this point the computer has tried every move possible.
                    //and it can't make the pile a number power of 2 minus 1 so
                    //it will just generate a random remove amount..
                    Random gen = new Random() ;
                    return gen.nextInt((pileSize / 2)) + 1 ;
                    
                } else {

                    //if it doesn't find it,reduce the max amount of
                    //moves possible by 1.
                    removeAmount-- ;
                    counter = 0 ;
                }
            }
        }

        return 0; //returns nothing if none of the conditions are met.
    }

    /**
     * Sets the name of the Player playing.
     *
     * @param playerName contains the player name
     */
    public void setName(String playerName) {
        name = playerName ;
    }

    /**
     * Gets the name of the Player.
     *
     * @return Returns the name of the Player.
     */
    public String getName() {

        return name ;
    }
    
    /**
    * Returns the type of player as a string.
    * @return The type of player as a string.
    */
    public String playerType(){
        
        return "the Smart Computer Object" ;
    }
}
