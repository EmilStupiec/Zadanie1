package emil.stupiec;

import java.util.List;

public class NegativeValuesPassed extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public NegativeValuesPassed(){}
	public NegativeValuesPassed(String message){
		super(message);
	}
	public NegativeValuesPassed(String message, List<Integer> negative_values) {
		super(message+" "+negative_values.toString());	
	}
}
