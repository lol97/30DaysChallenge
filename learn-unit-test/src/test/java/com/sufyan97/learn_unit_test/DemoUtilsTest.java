package com.sufyan97.learn_unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class DemoUtilsTest {
	
	@Test
	void testEqualAndNotEquals() {
		DemoUtils demoUtils = new DemoUtils();
		
		assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
		assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
	}
	
	@Test
	void testNullAndNotNull() {
		DemoUtils demoUtils = new DemoUtils();
		
		String str1 = null;
		String str2 = "lele was here";
		
		assertNull(demoUtils.checkNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
	}
}
