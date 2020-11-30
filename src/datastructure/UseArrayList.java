package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(56);
		list.add(67);
		list.add(23);
		list.add(12);



		for (Integer addList : list) {
			System.out.print(addList);
		}

		list.remove(1);
		System.out.print("\nModified list after removing one value: \n"+list);

//		Iterator removeList = list.iterator();
//		while (removeList.hasNext()) {
//
//		}

	}

}
