package TrainStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//split list
		List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
		List<String> listNew = list.stream().flatMap(s -> {
			String[] split = s.split(",");
			Stream<String> stream = Arrays.stream(split);
			return stream;
		}).collect(Collectors.toList());
		
		System.out.println(" Set before processing ：" + list);
		System.out.println(" Processed set ：" + listNew);
	}
}
