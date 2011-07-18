package emil.stupiec;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * main class
 *
 */
public class App 
{
	private static Calculator kata=new Calculator();
	private static Integer add() throws InvalidValue{
		String help_string="//;,3,7;-6,4,-5,-5,6;-4";
		return kata.add(help_string);
	}
    public static void main( String[] args ) throws InvalidValue
    {
    	System.out.println(add());
    }
}
