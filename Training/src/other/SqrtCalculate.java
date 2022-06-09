package other;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class SqrtCalculate {
	final static float P = 10e-7f;
	
	public static void main(String[] args) {
		algorithmYoutube(2019);
	}

	public static float algorithmYoutube(float a) {
		float x = a;
		float y = 0;
		boolean cond = true;
		do {
			y = ((x + a) / x) / 2;
			cond = Math.abs(y-x) > P;
			x = y;
		} while (cond);
		return y;
	}
	
	@Test
	public void testSqrtPositive() {
		assertTrue(algorithmYoutube(2019) - Math.sqrt(2019) < P);
		assertTrue(algorithmYoutube(4) - Math.sqrt(4) < P);
		assertTrue(algorithmYoutube(14045f) - Math.sqrt(14045) < P);
		assertTrue(algorithmYoutube(140810150068f) - Math.sqrt(140810150068d) < P);
		assertTrue(algorithmYoutube(666f) - Math.sqrt(666d) < P);
		assertTrue(algorithmYoutube(200f) - Math.sqrt(200d) < P);
	}
	
}
