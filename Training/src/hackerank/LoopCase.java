package hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopCase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		for (int x = 1; x <= 10; x++) {
			System.out.printf("%d x %d = %d\n", n, x, n * x);
		}
		bufferedReader.close();
	}
}
