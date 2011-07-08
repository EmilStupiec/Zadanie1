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

import java.util.Random;

public class Game {
	private Integer score;
	private Integer frame_id;
	private Integer try_id;
	private Integer first_try_score;
	private Boolean last;
	Game(){
		score=0;
		frame_id=0;
		try_id=0;
		first_try_score=0;
		last=false;
	}
	public void roll(Integer pins){
		Integer try_score=0;
		Random generator = new Random();
		if(try_id==0){
			try_score=generator.nextInt(11);
			first_try_score=try_score;
		}else{
			try_score=generator.nextInt(11-first_try_score);
		}
		score+=try_score;
		try_id++;
	}
	public Integer score(){
		return score;
	}
	public String toString(){
		String s="";

		return s;
	}
}

