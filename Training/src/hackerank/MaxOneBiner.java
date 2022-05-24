package hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MaxOneBiner {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String strBinary = Integer.toBinaryString(n);
        String[] split = strBinary.split("0");
        List<String> strSplit = Arrays.asList(split);
        System.out.println(
            strSplit.stream().reduce((x, y)->x.length() > y.length() ? x : y).get().length()
        );
        bufferedReader.close();
	}
}
