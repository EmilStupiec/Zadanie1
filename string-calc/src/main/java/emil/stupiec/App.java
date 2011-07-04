package emil.stupiec;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Kata kata=new Kata();
	
	public static Integer add(String numbers){
		return kata.add(numbers);
	}
	
    public static void main( String[] args )
    {
    	System.out.println(add(args[0]));
    }
}
