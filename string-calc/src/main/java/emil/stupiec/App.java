package emil.stupiec;

/**
 * main class
 *
 */
public class App 
{
	//creating calculator object with add method
	private static Kata kata=new Kata();
	
	public static Integer add(String numbers){
		//help string
		String numbers2="//:,-1000,34\n66,5:-15";
		return kata.add(numbers2);
	}
	
    public static void main( String[] args )
    {
    	//print result of add function
    	System.out.println(add(args[0]));
    }
}
