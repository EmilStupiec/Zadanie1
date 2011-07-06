package emil.stupiec;

import java.util.Random;

public class Game {
	private Frame[] frames;
	private Integer actual_frame=null;
	private Integer pins_knocked=null;
	Game(){
		frames=new Frame[10];
		actual_frame=0;
		pins_knocked=0;
		frames[9].setFinal_frame(true);
	}

	public void roll(Integer pins){
		if(pins!=10){
			Random generator = new Random();
			Integer score=generator.nextInt(11-pins);
			pins_knocked=score;
			switch(frames[actual_frame].getTry_number()){
				case 0:	frames[actual_frame].setScore_try1(score);
						break;
				case 1: frames[actual_frame].setScore_try2(score);
						break;
				case 2: frames[actual_frame].setScore_try3(score);
						break;
			}
			
			if(score==10 && frames[actual_frame].getTry_number()==0)
				frames[actual_frame].setStrike(true);
			else if(score==10 && frames[actual_frame].getTry_number()==1)
				frames[actual_frame].setSpare(true);
		}
		frames[actual_frame].setTry_number(frames[actual_frame].getTry_number()+1);
		if(	frames[actual_frame].getStrike()==true || 
			(frames[actual_frame].getFinal_frame() && frames[actual_frame].getTry_number()>2) ||
			(frames[actual_frame].getFinal_frame()==false && frames[actual_frame].getTry_number()>1))
				actual_frame++;
	}
	public Integer score(){
		Integer score=null;
		
		return score;
	}
	public Integer getPins_knocked(){
		return pins_knocked;
	}
	public String toString(){
		String s="";
		for(int i=0;i<10;i++){
			s+="Frame "+i+":\n";
			s+=frames[i].toString();
		}
		return s;
	}
}
