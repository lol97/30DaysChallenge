package TrainStream;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MachineTrain {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Jonathan", 10000000L, 27, Sex.MALE, "New York"));
		personList.add(new Person("Lia", 8000000L, 19, Sex.FEMALE, "Johanesbroug"));
		personList.add(new Person("Rony", 17000000L, 23, Sex.MALE, "New York"));
		
		System.out.println(findMaxWage(personList).toString());
	}
	
	public static Person findMaxWage(List<Person> persons) {
		Optional<Person> max = persons.stream().max(Comparator.comparingLong(Person::getWage));
		if(max.isPresent())
			return max.get();
		else
			return null;
	}
	
}
