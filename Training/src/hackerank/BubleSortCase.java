package hackerank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class BubleSortCase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		// Write your code here
		int round = 0;
		for (int i = 0; i < n; i++) {
			int numSwap = 0;
			for (int j = 0; j < n - 1; j++) {
				if (a.get(j) > a.get(j + 1)) {
					int prev = a.get(j + 1);
					a.set(j + 1, a.get(j));
					a.set(j, prev);
					numSwap += 1;
					round += 1;
				}
			}
			if (numSwap == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + round + " swaps.");
		System.out.println("First Element: " + a.get(0));
		System.out.println("Last Element: " + a.get(n - 1));

		bufferedReader.close();
	}
}
