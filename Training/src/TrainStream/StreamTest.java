package TrainStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//split list
//		List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
//		List<String> listNew = list.stream().flatMap(s -> {
//			String[] split = s.split(",");
//			Stream<String> stream = Arrays.stream(split);
//			return stream;
//		}).collect(Collectors.toList());
//		
//		System.out.println(" Set before processing ：" + list);
//		System.out.println(" Processed set ：" + listNew);
		
		/***
		 * seek Integer The sum of the elements of a set 、 Product and maximum .
		 */
		List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
		//Sum method 1
		Optional<Integer> sum1 = list.stream().reduce((x, y) -> x+y);
		//Sum method 2
		Optional<Integer> sum2 = list.stream().reduce(Integer::sum);
		//Sum method 3
		Integer sum3 = list.stream().reduce(0, Integer::sum);
		System.out.println("list Sum up ：" + sum1.get() + "," + sum2.get() + "," + sum3);
		
	}
}
