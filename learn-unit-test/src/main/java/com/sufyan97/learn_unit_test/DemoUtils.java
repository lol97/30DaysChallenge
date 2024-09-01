package com.sufyan97.learn_unit_test;

public class DemoUtils {
	public int add(int a, int b) {
		return a + b; //break on purpose
	}
	
	public Object checkNull(Object obj) {
		if (obj != null) {
			return obj;
		}
		return null;
	}
}
