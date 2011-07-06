package emil.stupiec;

public class Frame {
	private Integer frame_id=null;
	private Boolean strike=null;
	private Boolean spare=null;
	private Integer score_try1;
	private Integer score_try2;
	private Integer score_try3;
	Frame(Integer frame_id){
		this.frame_id=frame_id;
		this.score_try1=0;
		this.score_try2=0;
		this.score_try3=0;
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
}
