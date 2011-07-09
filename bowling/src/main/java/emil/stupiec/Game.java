/*package emil.stupiec;

import java.util.Random;

public class Game {
	private Frame[] frames;
	private Integer actual_frame=null;
	private Integer pins_knocked=null;
	private Boolean was_spare_or_strike=null;
	Game(){
		frames=new Frame[10];
		for (int i = 0; i<10; i++){
            frames[i] = new Frame();
		}
		actual_frame=0;
		pins_knocked=0;
		was_spare_or_strike=false;
		frames[9].setFinal_frame(true);
	}

	public void roll(Integer pins){
			Random generator = new Random();
			System.out.println(pins+"\n");
			Integer roll_score=generator.nextInt(11-pins);
			pins_knocked=roll_score;
			switch(frames[actual_frame].getTry_number()){
				case 0:	frames[actual_frame].setScore_try1(roll_score);
						break;
				case 1: frames[actual_frame].setScore_try2(roll_score);
						break;
				case 2: frames[actual_frame].setScore_try3(roll_score);
						break;
			}
			
			if(roll_score==10 && frames[actual_frame].getTry_number()==0){
				frames[actual_frame].setStrike(true);
				was_spare_or_strike=true;
			}
			else if((frames[actual_frame].getScore_try1()+frames[actual_frame].getScore_try2())==10 && frames[actual_frame].getTry_number()==1){
				frames[actual_frame].setSpare(true);
				was_spare_or_strike=true;
			}
		frames[actual_frame].setTry_number(frames[actual_frame].getTry_number()+1);
		System.out.println("Actual frame:"+actual_frame+":\n"+frames[actual_frame].toString());
		if(	frames[actual_frame].getStrike()==true ||
			frames[actual_frame].getFinal_frame() && frames[actual_frame].getTry_number()>2 ||
			frames[actual_frame].getTry_number()>1)
			actual_frame++;
		
	}
	public Integer score(){
		Integer score=0;
		for(int i=0;i<10;i++){
			if(frames[i].getStrike()){
				if(frames[i].getFinal_frame())
					score+=10;
				else{
					score+=10;
					if(frames[i+1].getStrike()){
						score+=10;
						if(frames[i+1].getFinal_frame()==false){
							score+=frames[i+2].getScore_try1();
						}
					}else{
						score+=frames[i+1].getScore_try1();
						score+=frames[i+1].getScore_try2();
					}
				}
			}else if(frames[i].getSpare()){
				if(frames[i].getFinal_frame())
					score+=10;
				else{
					score+=10;
					score+=frames[i+1].getScore_try1();
				}
			}else{
				score+=frames[i].getScore_try1();
				score+=frames[i].getScore_try2();
			}
		}
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
}*/

package emil.stupiec;

public class Game {
	//array for objects representing frame
	private Frame[] frames;
	//actual frame in game
	private Integer frame_id;
	//true if in game was strike or spare
	private Boolean was_bonus;
	Game(){
		frames=new Frame[10];
		for(int i=0;i<10;i++){
			frames[i]=new Frame();
		}
		frames[9].setFinal_frame(true);
		frame_id=0;
		was_bonus=false;
	}
	public void roll(Integer pins){
		//if player tried two times i actual frame,(and it is not last frame) go to next frame
		if((frames[frame_id].getFinal_frame()==false && frames[frame_id].getTry_number()>1)||frames[frame_id].getStrike())
			frame_id++;
		//if first try in frame
		if(frames[frame_id].getTry_number()==0){
			frames[frame_id].setScore_try1(pins);
			//set strike for frame
			if(pins==10){
				frames[frame_id].setStrike(true);
				was_bonus=true;
			}
		//if second try in frame
		}else if(frames[frame_id].getTry_number()==1){
			frames[frame_id].setScore_try2(pins);
			//set spare for frame
			if(pins+frames[frame_id].getScore_try1()==10 && frames[frame_id].getStrike()==false){
				frames[frame_id].setSpare(true);
				was_bonus=true;
			}
		//if third try in frame(only for last frame)
		}else if(frames[frame_id].getTry_number()==2)
			frames[frame_id].setScore_try3(pins);
		frames[frame_id].setTry_number(frames[frame_id].getTry_number()+1);
	}
	public Integer score(){
		Integer score=0;
		//for every frame
		for(int i=0;i<10;i++){
			//sum its scores
			score+=frames[i].getScore_try1()+frames[i].getScore_try2()+frames[i].getScore_try3();
			//if there was a strike in frame and it's not a last frame
			if(frames[i].getStrike() && frames[i].getFinal_frame()==false){
				//if there was a strike in frame+1 and it's not a last frame
				if(frames[i+1].getStrike() && frames[i+1].getFinal_frame()==false)
					score+=10+frames[i+2].getScore_try1();
				//if there was a strike in frame+1 and it's a last frame
				else if(frames[i+1].getStrike() && frames[i+1].getFinal_frame())
					score+=10;
				//if there wasn't a strike in frame+1
				else
					score+=frames[i+1].getScore_try1()+frames[i+1].getScore_try2();
			//if there was a spare in current frame and it was not the last frame
			}else if(frames[i].getSpare() && frames[i].getFinal_frame()==false){
				score+=frames[i+1].getScore_try1();
			}
		}
		return score;
	}
	public Boolean getFinal_frame(){
		return frames[frame_id].getFinal_frame();
	}
	public String toString(){
		String s="";
		s+=frame_id+"\n";
		for(int i=0;i<10;i++)
			s+=i+":\n"+frames[i].toString()+"\n";
		return s;
	}
	public Boolean getWas_bonus(){
		return was_bonus;
	}
}

