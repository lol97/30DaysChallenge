package TrainStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonelStream {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Jonathan", 10000000L, 27, Sex.MALE, "New York"));
		personList.add(new Person("Lia", 8000000L, 19, Sex.FEMALE, "Johanesbroug"));
		personList.add(new Person("Rony", 17000000L, 23, Sex.MALE, "New York"));
		
		/**
		 * sum wages
		 */
		Optional<Long> sumWages1 = personList.stream().map(Person::getWage).reduce(Long::sum);
		System.out.println(sumWages1.get());
	}
}
