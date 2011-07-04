package emil.stupiec;

//class for add function
public class Kata {
	
	Kata(){}
	
	Integer add(String numbers){
		//initialize returning sum
		Integer sum=null;
		if(numbers.isEmpty()){
			sum=0;
		//look for delimiters
		}else if(numbers.contains(",") || numbers.contains("\n")){
			//split into numbers
			String numbers_splited[]=numbers.split("[(,)(\n)]");
			if(numbers_splited.length>=2){
				sum=0;
				//add all splited numbers
				for(String s: numbers_splited)
					sum+=Integer.parseInt(s);
			}
		}else{
			//only one number
			sum=Integer.parseInt(numbers);
		}
		return sum; 
	}
}
