package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile ="/Users/ahmed/intelliJ/MidtermSept2020/src/data/self-driving-car.txt";

		FileReader fileRd = null;
		BufferedReader bufferRd = null;

		try {
			fileRd = new FileReader(textFile);
		}
		catch (FileNotFoundException e) {
			System.out.print("File is not found, please check for the correct file");
		}

		try {
			bufferRd = new BufferedReader(fileRd);
			String data = "";

			while ((data = bufferRd.readLine()) != null) {
				System.out.println(data);
			}
		}
		catch(Exception ex) {
			System.out.print("File is not readable, maybe corrupted");
		}
		finally {
			if (bufferRd != null) {
				bufferRd.close();
			}
			if (fileRd != null) {
				fileRd.close();
			}
		}


//		Stack<String> stack = new Stack<>();
//		stack.push(textFile);
//
//
//		for (int i = stack.size(); i>0; i--) {
//
//			System.out.print("\nPeek Element: " + stack.peek());
//			//System.out.println("\n"+ stack.pop());
//		}



//		//normal stack operation
//		Stack<String> st = new Stack<>();
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		st.push("4");
//		st.push("5");
//
//		for (int j=st.size(); j>0; j--) {
//			System.out.print("Peek: "+ st.pop());
//			System.out.print(st.pop());
//		}

	}

}
