
//Michael Wong

import java.util.Scanner;

/**
 * Test class for the Nim Game.
 *
 */
public class NimGameTest {

    public static void main(String[] args) {

        boolean playAgain = true ;
        Scanner userInput = new Scanner(System.in) ;
        
        while (playAgain) { //keep playing till the user enters N.
            
            //PlayerGenerator does all the output's/asks/gets the users 
            //specified type of player objects..., and the player name.
            //This was originally here but was too clutered so I moved it to
            //a different class.     
            PlayerGenerator newPlayer = new PlayerGenerator() ;
            
            //Contains the players in a array.
            Player [] player = newPlayer.createPlayer() ;
            
            Nim game = new Nim() ; //Creates the game and generates a pile of
            //marbles.
            
            //Passes the array with the player specs.
            game.play(player) ; //Plays the game
            
            //Asks the user if they would like to play again.
            System.out.println("\n" + "Would you like to play again (Y/N)?") ;
            playAgain = userInput.nextLine().equalsIgnoreCase("y") ;
            
        }  
        
    }
}
