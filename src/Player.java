
//Michael Wong

/**
 * The player interface has 3 different types of players
 * A human, SmartComputer and a BelowAverageComputer(stupid computer)
 */
public interface Player {
    
    public int move(int pileSize) ;
    public void setName(String playerName) ;
    public String getName() ;
    public String playerType() ; 
    
}
