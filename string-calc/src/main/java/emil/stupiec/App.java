package emil.stupiec;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * main class
 *
 */
public class App 
{
	//creating calculator object with add method
	private static Calculator kata=new Calculator();
	
	public static Integer add(String numbers) throws InvalidValue{
		//help string
		String numbers2="//;,12\n12,3";
		return kata.add(numbers2);
	}
	
    public static void main( String[] args ) throws InvalidValue
    {
    	//print result of add function
    	System.out.println(add(args[0]));
    }
}
