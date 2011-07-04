package emil.stupiec;

public class Kata {
	
	Kata(){}
	
	Integer add(String numbers){
		Integer sum=null;
		if(numbers.isEmpty()){
			sum=0;
		}else if(numbers.contains(",")){
			String numbers_splited[]=numbers.split(",");
			if(numbers_splited.length>=2){
				sum=0;
				for(String s: numbers_splited)
					sum+=Integer.parseInt(s);
			}
		}else{
			sum=Integer.parseInt(numbers);
		}
		return sum; 
	}
}
