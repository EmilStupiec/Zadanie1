package emil.stupiec;

import java.util.List;

public class NegativeValuesPassed extends RuntimeException{
	private List<Integer> negative_values;
	public NegativeValuesPassed(){}
	public NegativeValuesPassed(String message){
		super(message);
	}
	public NegativeValuesPassed(String message, List<Integer> negative_values) {
		super(message+" "+negative_values.toString());
		this.negative_values=negative_values;	
	}
}
