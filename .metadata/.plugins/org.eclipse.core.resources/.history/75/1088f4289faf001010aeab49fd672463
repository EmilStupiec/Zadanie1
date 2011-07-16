package emil.stupiec;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class CalculatorTest {

	@Test
	public void should_return_zero_for_empty_string() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=0;
		Integer result=calculator.add("");
		assertEquals("Didn't return 0 for empty string",expected,result);
	}
	@Test
	public void should_return_given_one_number() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=3;
		Integer result=calculator.add("3");
		assertEquals("Didn't return 3 for string \"3\"",expected,result);
	}
	@Test
	public void should_return_sum_of_two_given_numbers() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=10;
		Integer result=calculator.add("3,7");
		assertEquals("Didn't return 10 for string \"3,7\"",expected,result);
	}
	@Test
	public void should_return_sum_of_all_given_numbers() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=40;
		Integer result=calculator.add("3,7,6,4,5,5,6,4");
		assertEquals("Didn't return 40 for string \"3,7,6,4,5,5,6,4\"",expected,result);
	}
	@Test
	public void should_return_sum_of_all_given_numbers_using_new_line_delimiter() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=40;
		Integer result=calculator.add("3,7\n6,4,5,5,6\n4");
		assertEquals("Didn't return 40 for string \"3,7\n6,4,5,5,6\n4\"",expected,result);
	}
	@Test
	public void should_return_sum_of_all_given_numbers_using_different_delimiter() throws InvalidValue{
		Calculator calculator=new Calculator();
		Integer expected=40;
		Integer result=calculator.add("//;,3,7;6,4,5,5,6;4");
		assertEquals("Didn't return 40 for string \"//;,3,7;6,4,5,5,6;4\"",expected,result);
	}
	@Test
	public void should_thorw_exception_for_negative_values() throws InvalidValue{
		Calculator calculator=new Calculator();
		try{
			calculator.add("//;,3,7;-6,4,-5,-5,6;-4");
		}catch (InvalidValue e) {
			if(e.toString().contains("negatives passed:[-6, -5, -5, -4]"))
				assertTrue(true);
			else
				fail("negatives exception fail");
		}
	}
}
