package TrainStream;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

public class StatisticsStream {
	public static void main(String[] args) {
		/**
		 * Collectors Provides a series of static methods for data statistics ：
		 * 
		 * Count ：count
		 * 
		 * Average ：averagingInt、averagingLong、averagingDouble
		 * 
		 * The most value ：maxBy、minBy
		 * 
		 * Sum up ：summingInt、summingLong、summingDouble
		 * 
		 * Count all of the above ：summarizingInt、summarizingLong、summarizingDouble
		 * 
		 * Case study ： Count the number of employees 、 Average wage 、 Total wages 、
		 * Maximum wage .
		 */
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person("Wildan Purnama", 1000000L, 20, Sex.MALE, "Cirebon"));
		listPerson.add(new Person("Renita Satriana", 4000000L, 30, Sex.FEMALE, "Sumedang"));
		listPerson.add(new Person("Satria Riani", 4100000L, 30, Sex.MALE, "Tegal"));

		// sum total item list
		Long total = listPerson.stream().collect(Collectors.counting());
		System.out.printf("total data was %d \n", total);

		// get average wage
		Double averageWage = listPerson.stream().collect(Collectors.averagingLong(Person::getWage));
		System.out.printf("average wage was %.2f \n", averageWage);
		
		// max salary
		Optional<Long> maxOpt = listPerson.stream().map(Person::getWage).collect(Collectors.maxBy(Long::compare));
		System.out.printf("max wage was %d \n", maxOpt.get());
		
		// sum wage
		Long totalWage = listPerson.stream().collect(Collectors.summingLong(Person::getWage));
		System.out.printf("total wage was %d \n", totalWage);
		
		// summary statistics
		LongSummaryStatistics wageStatistics = listPerson.stream().collect(Collectors.summarizingLong(Person::getWage));
		System.out.println("summary wage was " + wageStatistics);
	}
	
}
