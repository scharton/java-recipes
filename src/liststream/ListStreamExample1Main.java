package liststream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Taken from https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html.
 * 
 * @author dscharton
 * @created Sep 25, 2018 3:59:05 PM
 *
 */
public class ListStreamExample1Main {

	private static final int MAX_INT = 99;

	public static void main(String args[]) {
		List<Integer> listOfIntegers = new ArrayList<>();
		for (int i = 1; i <= MAX_INT; i++) {
			listOfIntegers.add(i);
		}

		System.out.println("listOfIntegers:");
		listOfIntegers.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("\n");

		System.out.println("listOfIntegers sorted in reverse order:");
		Comparator<Integer> normal = Integer::compare;
		Comparator<Integer> reversed = normal.reversed();
		Collections.sort(listOfIntegers, reversed);
		listOfIntegers.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("\n");

		System.out.println("Parallel stream");
		listOfIntegers.parallelStream().forEach(e -> System.out.print(e + " "));
		System.out.println("\n");

		System.out.println("Another parallel stream:");
		listOfIntegers.parallelStream().forEach(e -> System.out.print(e + " "));
		System.out.println("\n");

		System.out.println("With forEachOrdered:");
		listOfIntegers.parallelStream().forEachOrdered(e -> System.out.print(e + " "));
		System.out.println("\n");
	}
}
