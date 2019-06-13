package org.apache.maven.Saturn;
import org.junit.Test;

import junit.framework.TestCase;

public class test_subtract extends TestCase {
	@Test
	public void testMinus() {
        int expected = 0;
        int actual = Test_subtract.t(12, 4);
        assertEquals("subtracting 4 from 12", expected, actual);
	}
}


