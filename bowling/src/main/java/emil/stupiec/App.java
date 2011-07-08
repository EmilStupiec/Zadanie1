/*package emil.stupiec;

/**
 * Bowling Game
 *
 *
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
}*/

package emil.stupiec;

import java.util.Random;

/**
 * Bowling Game
 *
 */
public class App 
{
    public static void main( String[] args ){
    	Game game=new Game();
    	Random generator=new Random();
    	Integer result1,result2;
    	for(int i=0;i<10;i++){
    		result1=generator.nextInt(11);
    		game.roll(result1);
    		result2=generator.nextInt(11-result1);
    		game.roll(result2);
    		if(game.getFinal_frame() && game.getWas_bonus() && result2<10){
    			Integer result3=generator.nextInt(11-(result1+result2));
    			game.roll(result3);
    		}
    	}
    	
    	System.out.println(game.toString());
    	System.out.println(game.score());
    }
}
