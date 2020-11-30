package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Apple");
		queue.add("Orange");
		queue.add("Berry");
		queue.add("Watermelon");
		queue.add("Mango");

		System.out.print("Queue peek is :" +queue.peek()+"\n\n");

		// poll method removes the first element
		System.out.print("Queue poll is :" +queue.poll()+"\n\n");

		// while loop using iterator
		Iterator printQ = queue.iterator();
		while (printQ.hasNext()) {
			System.out.print(printQ.next()+"\n");
		}

		// for each loop
		for (String p1: queue) {
			System.out.print(" \n"+p1);
		}

		queue.remove(1);
		System.out.println("\n\n"+ queue);
	}

}
