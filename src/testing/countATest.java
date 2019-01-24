package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class countATest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Calculations test = new Calculations();
		int output = test.countA("JAVAbeans");
		assertEquals(3, output);
	}
	
}
