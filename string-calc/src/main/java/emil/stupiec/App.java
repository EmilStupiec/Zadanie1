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
		String help_string="//:,12\n12:4,2,4:6,5,4\n6";
		return kata.add(help_string);
	}
    public static void main( String[] args ) throws InvalidValue
    {
    	System.out.println(add());
    }
}
