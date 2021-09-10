
//Michael Wong

import java.util.Scanner ;

/**
 * This class was created due to the clutter in the main method.
 * The code in the createPlayer method is shorter and is slightly different
 * from the original version in the main method.
 * 
 */
public class PlayerGenerator {

    private int playerCounter = 0 ;
    
    /**
     * Asks and gets the user specified player type and name.
     * @return Contains the types of players Up-Casted to a Player.
     */
    public Player[] createPlayer() {
        
        int playerChoice ;
        
        Player[] player = new Player[2]; //The player types like human, smart 
        //comp, etc.. are upcasted to Player in this array.
        
        Scanner userInput = new Scanner(System.in) ;
        
        while (playerCounter <= 1) { //While there is less than 2 players
            //keep looping to ask what types of players to create.
            
            
            System.out.println() ;
            if (playerCounter == 0) { //creating First player message.
                
                System.out.println("1 - Human, 2 - Smart Computer,"
                        + " 3 - Stupid Computer" + "\n" + 
                        "Who will go first?: ") ;
                
            } else if (playerCounter == 1) { //creating Second player message.
                
                System.out.println("1 - Human, 2 - Smart Computer,"
                        + " 3 - Stupid Computer" + "\n" + 
                        "Who will Second?: ") ;
            }

            //If the user enters invalid input, loop and ask them again.
            
            while (!userInput.hasNextInt()) {
                userInput.next();
                System.out.println("Please enter a valid option: "
                        + "(1 or 2 or 3): ") ;
            }

            playerChoice = userInput.nextInt() ;

            if (playerChoice == 1) {
                //Creates a human Player Object
                player[playerCounter] = new Human() ;

            } else if (playerChoice == 2) {
                //Creates a SmartComputer Object
                player[playerCounter] = new SmartComputer() ;

            } else if (playerChoice == 3) {
                //Creates a BelowAverageComputer Object
                player[playerCounter] = new BelowAverageComputer() ;

            } else {
                //This is here so that we can player.setName works without it 
                //being within the if statements.
                System.out.println("Unkown player type. Defaulting to Smart "
                        + "Computer");
                
                player[playerCounter] = new SmartComputer() ;
            }

                System.out.println("Enter Player " +(playerCounter +1) 
                        + "'s Name: ") ;
          

            player[playerCounter].setName(userInput.next()) ; //Gets the players 
            //name from the user
            
            playerCounter++ ; //After a player is created, add one to the player 
            //count
        }

        return player ; //Returns the players.

    }

}
