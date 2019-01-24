package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class squareTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Calculations test = new Calculations();
		int output = test.square(5);
		assertEquals(25, output);
	}

	@Test
	public void testNotNull() {
		Calculations test = new Calculations();
		int output = test.square(5);
		assertNotNull(output);
	}
	
}
