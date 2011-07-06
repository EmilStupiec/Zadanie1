package emil.stupiec;

import java.util.Random;

public class Game {
	private Frame frames[];
	Game(){
		
	}

	void roll(Integer pins){
		if(pins!=10){
			Random generator = new Random();
			pins=generator.nextInt(11);
		}
	}
	Integer score(){
		Integer score=null;
		
		return score;
	}
}
