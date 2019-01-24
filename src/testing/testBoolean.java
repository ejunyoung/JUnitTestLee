package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testBoolean {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testYoungAge() {
		
		Calculations test = new Calculations();
		boolean youngAge = test.testYoungAge(30);
		assertFalse(youngAge);
		
	}

}
