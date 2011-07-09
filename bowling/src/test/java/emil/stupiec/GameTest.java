package emil.stupiec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
	private Game[] testgame;
	@Before
	public void setUp() throws Exception {
		testgame=new Game[4];
		for(int i=0;i<4;i++)
			testgame[i]=new Game();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testScore() {
		Integer expected,result;
		testgame[0].roll(10);
		testgame[0].roll(5);
		testgame[0].roll(5);
		testgame[0].roll(4);
		testgame[0].roll(0);
		testgame[0].roll(5);
		testgame[0].roll(3);
		testgame[0].roll(9);
		testgame[0].roll(1);
		testgame[0].roll(10);
		testgame[0].roll(9);
		testgame[0].roll(0);
		testgame[0].roll(3);
		testgame[0].roll(1);
		testgame[0].roll(10);
		testgame[0].roll(10);
		expected=128;
		result=testgame[0].score();
		assertEquals("score test 1 failed",expected,result);

		testgame[1].roll(3);
		testgame[1].roll(1);
		testgame[1].roll(2);
		testgame[1].roll(3);
		testgame[1].roll(2);
		testgame[1].roll(1);
		testgame[1].roll(1);
		testgame[1].roll(0);
		testgame[1].roll(4);
		testgame[1].roll(2);
		testgame[1].roll(1);
		testgame[1].roll(1);
		testgame[1].roll(2);
		testgame[1].roll(3);
		testgame[1].roll(1);
		testgame[1].roll(0);
		testgame[1].roll(1);
		testgame[1].roll(2);
		testgame[1].roll(1);
		testgame[1].roll(1);
		expected=32;
		result=testgame[1].score();
		assertEquals("score test 2 failed",expected,result);

		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		testgame[2].roll(10);
		expected=270;
		result=testgame[2].score();
		assertEquals("score test 1 failed",expected,result);

		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		testgame[3].roll(0);
		expected=0;
		result=testgame[3].score();
		assertEquals("score test 1 failed",expected,result);
	}
}
