package emil.stupiec;

public class Frame {
	private Boolean strike=null;
	private Boolean spare=null;
	private Integer try_number=null;
	private Integer score_try1=null;
	private Integer score_try2=null;
	private Integer score_try3=null;
	private Boolean final_frame=null;
	Frame(){
		this.try_number=0;
		this.score_try1=0;
		this.score_try2=0;
		this.score_try3=0;
		this.strike=false;
		this.spare=false;
		this.spare=false;
		this.final_frame=false;
	}
	public void setStrike(Boolean strike){
		this.strike=strike;
	}
	public Boolean getStrike(){
		return this.strike;
	}
	public void setSpare(Boolean spare){
		this.spare=spare;
	}
	public Boolean getSpare(){
		return this.spare;
	}
	public void setTry_number(Integer try_number){
		this.try_number=try_number;
	}
	public Integer getTry_number(){
		return this.try_number;
	}
	public void setScore_try1(Integer score_try1){
		this.score_try1=score_try1;
	}
	public Integer getScore_try1(){
		return this.score_try1;
	}
	public void setScore_try2(Integer score_try2){
		this.score_try2=score_try2;
	}
	public Integer getScore_try2(){
		return this.score_try2;
	}
	public void setScore_try3(Integer score_try3){
		this.score_try3=score_try3;
	}
	public Integer getScore_try3(){
		return this.score_try3;
	}
	public Boolean getFinal_frame(){
		return this.final_frame;
	}
	public void setFinal_frame(Boolean final_frame){
		this.final_frame=final_frame;
	}
	public String toString(){
		String s="Strike: "+strike+"\n";
		s+="Spare: "+spare+"\n";
		s+="Times tried: "+try_number+"\n";
		s+="Tries Score: "+score_try1+" "+score_try2+" "+score_try3+"\n";
		s+="Final:"+final_frame+"\n";
		return s;
	}
}
