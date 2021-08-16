package demolearningproblem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollectionDemo {
	public static void main(String[] args) {
		
		doListDemo();
	
		
	}


	private static void doListDemo() {
		System.out.println("In doListDemo");
		
		List<String> list = new LinkedList<>();
		
		list.add("Krati");
		list.add("Shreya");
		list.add("Akshat");
		list.add("Virat");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
	
	
	
}	