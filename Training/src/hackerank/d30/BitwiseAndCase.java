package hackerank.d30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'bitwiseAnd' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER N 2. INTEGER K
	 */

	public static int bitwiseAnd(int N, int K) {
		// Write your code here
		int answer = 0;
		for (int a = 1; a < N; a++) {
			for (int b = a + 1; b <= N; b++) {
				int temp = a & b;
				if (temp > answer && temp < K)
					answer = temp;
			}
		}
		return answer;
	}

}

public class BitwiseAndCase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int count = Integer.parseInt(firstMultipleInput[0]);

				int lim = Integer.parseInt(firstMultipleInput[1]);

				int res = Result.bitwiseAnd(count, lim);

				bufferedWriter.write(String.valueOf(res));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
