package emil.stupiec;

public class Kata {
	
	Kata(){}
	
	Integer add(String numbers){
		Integer sum=null;
		if(numbers.isEmpty()){
			sum=0;
		}else if(numbers.contains(",")){
			String numbers_splited[]=numbers.split(",");
			if(numbers_splited.length==2){
				sum=Integer.parseInt(numbers_splited[0])+Integer.parseInt(numbers_splited[1]);
			}
		}else{
			sum=Integer.parseInt(numbers);
		}
		return sum; 
	}
}
