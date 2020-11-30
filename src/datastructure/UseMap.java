package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		List<String> windows = new ArrayList<String>();
		windows.add("Windows");
		windows.add("version Windows 10");

		List<String> ios = new ArrayList<String>();
		ios.add("MacOS");
		ios.add(" version mac 10.15 ");

		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("Macbook ", ios);
		map.put("Asus", windows);

		for (Map.Entry<String, List<String>> iterate: map.entrySet()) {
			System.out.println(iterate.getKey()+iterate.getValue()+"\n");
		}

		// while loop

		Iterator print = ios.listIterator();
		while (print.hasNext()) {
			System.out.print(print.next());
		}
		Iterator print2 = windows.listIterator();
		while (print2.hasNext()) {
			System.out.print(print2.next());
		}
	}

}
