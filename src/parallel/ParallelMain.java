package parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ParallelMain {

	private static final int NUM_MALES = 30000;
	private static final int NUM_FEMALES = 10000;

	public static void main(String[] args) {
		// Math.random() * 10;
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < NUM_MALES; i++) {
			Person p = new Person(Gender.M, randomAge());
			persons.add(p);
//			System.out.println(p.getAge());
		}
		for (int i = 0; i < NUM_FEMALES; i++) {
			persons.add(new Person(Gender.F, randomAge()));
		}

		for (Gender gender : Gender.values()) {
			double avgAge = persons
				.parallelStream()
				.filter(p -> p.getGender() == gender)
				.mapToInt(Person::getAge)
				.average()
				.getAsDouble();
			System.out.printf("Average age %s: %s\n", gender.toString(), Math.rint(avgAge));
			
		}
		
		Map<Gender, List<Person>> byGender = 
			persons
				.stream()
				.collect(Collectors.groupingByConcurrent(Person::getGender));
		
		Set<Entry<Gender, List<Person>>> entrySet = byGender.entrySet();
		for (Entry<Gender, List<Person>> entry : entrySet) {
			System.out.println(entry.getKey() + ", " + entry.getValue().size());
			
		}

	}
	
	static enum Gender {M, F};

	static class Person {

		Gender gender;
		int age;

		Person(Gender g, int a) {
			gender = g;
			age = a;
		}

		Gender getGender() {
			return gender;
		}

		int getAge() {
			return age;
		}
	}

	static int randomAge() {
		return Integer.valueOf((int) (Math.random() * 100));
	}

}
