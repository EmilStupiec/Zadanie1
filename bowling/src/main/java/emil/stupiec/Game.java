package emil.stupiec;

import java.util.Random;

public class Game {
	//actual frame number 0-9
	private Integer frame=null;
	//actual try number in this frame 0-2 (2 only 10th frame)
	private Integer try_number=null;
	//pins knocked in frame
	private Integer pins_knocked=null;
	//if there was a strike or spare
	private Boolean strike_or_spare=null;
	Game(){
		frame=0;
		strike_or_spare=false;
		try_number=0;
		pins_knocked=0;
	}
	public Integer getFrame(){
		return frame;
	}
	public Integer getPins_knocked(){
		return pins_knocked;
	}
	void roll(Integer pins){
		if(pins!=10){
			Random generator = new Random( 10-pins );
			pins=generator.nextInt();
		}
	}
	Integer score(){
		Integer score=null;
		
		return score;
	}
}
