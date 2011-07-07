package emil.stupiec;

/**
 * Bowling Game
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Game game=new Game();
    	for(int i=0;i<10;i++){
    		game.roll(0);
    		game.roll(game.getPins_knocked());
    	}
    	//System.out.println("The game:\n"+game.toString());
    	System.out.println(game.score());
    }
}
