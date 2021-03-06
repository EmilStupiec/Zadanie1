package emil.stupiec;

import java.util.ArrayList;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

//class for add function
public class Kata {
	
	Kata(){}
	
	Integer add(String numbers) throws InvalidValue{
		//initialize returning sum
		Integer sum=null;
		ArrayList<Integer> negatives=new ArrayList<Integer>();
		Boolean negative=false;
		
		if(numbers.isEmpty()){
			sum=0;
		//check if it's only one digit
		}else if(numbers.matches("^-?\\d+$")){
			sum=Integer.parseInt(numbers);
		//many digits and different delimiter
		}else{
			//matcher to split numbers from selected delimiter
			String string_matcher="[(,)(\n)";
			//check for different input delimiter
			if(numbers.matches("^//"+numbers.charAt(2)+"([(,)(\n)"+numbers.charAt(2)+"]-?\\d+)+")){
				string_matcher=string_matcher+"("+numbers.charAt(2)+")]";
				numbers=numbers.substring(4);
			}else
				string_matcher+="]";
			String numbers_splited[]=numbers.split(string_matcher);
			if(numbers_splited.length>=2){
				sum=0;
				for(String s: numbers_splited){
					if(Integer.parseInt(s)<0){
						negative=true;
						negatives.add(Integer.parseInt(s));
					}
					sum+=Integer.parseInt(s);
				}
			}
			if(negative){
				InvalidValue IV=new InvalidValue("negatives not allowed\nnegatives passed:"+negatives.toString());
				throw IV;
			}
		}
		return sum; 
	}
}
