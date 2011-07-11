package emil.stupiec;

import java.util.ArrayList;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

//class for add function
public class Calculator {
	Calculator(){}
	
	public Integer add(String in_string) throws InvalidValue{
		if(in_string.isEmpty())
			return 0;
		else if(in_string.matches("^-?\\d+$")){
			return if_string_is_one_number(in_string);
		}else{
			return sum_of_more_than_two_numbers(in_string);
		}
	}
	
	private Integer sum_of_more_than_two_numbers(String in_string) throws InvalidValue{
		String numbers_splited[]=in_string.split(create_string_matcher(in_string));
		return sum_numbers(numbers_splited);
	}
	private Integer if_string_is_one_number(String in_string) throws InvalidValue{
		Integer number=Integer.parseInt(in_string);
		if(number<0){
			InvalidValue invalid_value=new InvalidValue("negatives not allowed\nnegative passed:"+number);
			throw invalid_value;
		}
		return number;
	}
	private String create_string_matcher(String in_string){
		String string_matcher="[(,)(\n)";
		if(in_string.matches("^//"+in_string.charAt(2)+"([(,)(\n)"+in_string.charAt(2)+"]-?\\d+)+")){
			string_matcher=string_matcher+"("+in_string.charAt(2)+")]";
			in_string=in_string.substring(4);
		}else
			string_matcher+="]";
		return string_matcher;
	}
	private Integer sum_numbers(String[] numbers_splited) throws InvalidValue{
		Integer sum=0;
		for(String s: numbers_splited){
			if(Integer.parseInt(s)<0){
				check_for_other_negatives_and_throw_exception(numbers_splited);
			}else
			sum+=Integer.parseInt(s);
		}	
	return sum;
	}
	private void check_for_other_negatives_and_throw_exception(String[] numbers_splited) throws InvalidValue{
		ArrayList<Integer> negatives=new ArrayList<Integer>();
		for(String s: numbers_splited){
			if(Integer.parseInt(s)<0)
				negatives.add(Integer.parseInt(s));
		}
		InvalidValue invalid_value=new InvalidValue("negatives not allowed\nnegatives passed:"+negatives.toString());
		throw invalid_value;
	}
}
