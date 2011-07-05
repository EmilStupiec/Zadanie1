package emil.stupiec;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * main class
 *
 */
public class App 
{
	//creating calculator object with add method
	private static Kata kata=new Kata();
	
	public static Integer add(String numbers) throws InvalidValue{
		//help string
		String numbers2="//:,1000,34\n-66,5:15";
		return kata.add(numbers2);
	}
	
    public static void main( String[] args ) throws InvalidValue
    {
    	//print result of add function
    	System.out.println(add(args[0]));
    }
}
