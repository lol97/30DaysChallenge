package hackerank.d29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RegexEmailCase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		String regexPattern = "[a-z]+@gmail\\.com$";
		Pattern p = Pattern.compile(regexPattern);

		List<String> listName = new ArrayList<>();

		IntStream.range(0, N).forEach(NItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				String firstName = firstMultipleInput[0];

				String emailID = firstMultipleInput[1];
				Matcher m = p.matcher(emailID);
				if (m.find())
					listName.add(firstName);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		listName.stream().sorted().forEachOrdered(System.out::println);

		bufferedReader.close();
	}
}
