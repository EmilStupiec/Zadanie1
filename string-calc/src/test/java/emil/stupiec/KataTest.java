package emil.stupiec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class KataTest {
	Kata test_kata;
	private String empty;
	private String proper_one_number;
	private String bad_one_number;
	private String proper_two_arguments;
	private String bad_two_arguments;
	private String proper_many_arguments;
	private String proper_with_new_line;
	private String proper_different_delimiters;
	private String with_negatives;
	@Before
	public void setUp() throws Exception {
		test_kata=new Kata();
		empty="";
		proper_one_number="15";
		bad_one_number="13a";
		proper_two_arguments="34,6";
		bad_two_arguments="23.43";
		proper_many_arguments="25,25,50,10";
		proper_with_new_line="12,8\n5,5\n10";
		proper_different_delimiters="//;,3;4,4\n9;10";
		with_negatives="-23,5,7,-11,4";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() throws InvalidValue{
		
		Integer expected=0;
		Integer	result = test_kata.add(empty);
		assertEquals("empty string fail",expected,result);
		
		expected=15;
		result = test_kata.add(proper_one_number);
		assertEquals("one number fail",expected,result);
		
		try{
			result = test_kata.add(bad_one_number);
		}catch (RuntimeException e) {
			assertTrue(true);
		}
		
		expected=40;
		result = test_kata.add(proper_two_arguments);
		assertEquals("one number fail",expected,result);
		
		try{
			result = test_kata.add(bad_two_arguments);
		}catch (RuntimeException e) {
			assertTrue(true);
		}
		
		expected=110;
		result = test_kata.add(proper_many_arguments);
		assertEquals("one number fail",expected,result);
		
		expected=40;
		result = test_kata.add(proper_with_new_line);
		assertEquals("one number fail",expected,result);

		expected=30;
		result = test_kata.add(proper_different_delimiters);
		assertEquals("one number fail",expected,result);
		
		try{
			result = test_kata.add(with_negatives);
		}catch (InvalidValue e) {
			if(e.toString().contains("negatives passed:[-23, -11]"))
				assertTrue(true);
			else
				fail("negatives test fail");
		}
	}
}
