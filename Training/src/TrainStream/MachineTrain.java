package TrainStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MachineTrain {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();

		personList.add(new Person("Jonathan", 10000000L, 27, Sex.MALE, "New York"));
		personList.add(new Person("Lia", 8000000L, 19, Sex.FEMALE, "Johanesbroug"));
		personList.add(new Person("Rony", 17000000L, 23, Sex.MALE, "New York"));
		/***
		 * increase all person salary + 10000
		 */
		List<Person> newListWage = personList.stream().peek(person -> {
			person.setWage(person.getWage() + 10000L);
		}).collect(Collectors.toList());
		System.out.println(newListWage);
		System.out.println(personList);
		
		System.out.println(findMaxWage(personList).toString());

		/***
		 * Case four ： Calculation Integer Greater than in a set 6 The number of
		 * elements of
		 */
		List<Integer> list = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
		System.out.println("Total item that greater than 6 is : " + list.stream().filter(number -> number > 6).count());

		/***
		 * capitalize the item
		 */
		String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
		List<String> capList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(capList);

		/***
		 * add each item + 3
		 */
		List<Integer> newList = list.stream().map(x -> x + 3).collect(Collectors.toList());
		System.out.println("Every element + 3 : " + newList);
	}

	public static Person findMaxWage(List<Person> persons) {
		Optional<Person> max = persons.stream().max(Comparator.comparingLong(Person::getWage));
		if (max.isPresent())
			return max.get();
		else
			return null;
	}

}
